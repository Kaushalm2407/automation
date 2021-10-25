package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {
	
		public static void entertext(WebDriver driver, By locator, String text)
		{
			try {
				WebElement we=driver.findElement(locator);
				if(we.isEnabled())
				{
					we.sendKeys(text);
				}
				else
					System.out.println("Element is disabled");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Element not found : Incorrect locator");
			}
		}
			public static void clickElement(WebDriver driver, By locator)
			{
				try {
					WebElement we=driver.findElement(locator);
					if(we.isEnabled())
					{
						we.click();
					}
					else
						System.out.println("Element is Disabled");
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Element not found : Incorrect locator");
				}
			}
			public static void SelectRadio(WebDriver driver, By locator, String option)
			{
				List<WebElement> radios=driver.findElements(locator);
				
				for(WebElement rd:radios)
				{
					if(rd.getAttribute("value").equalsIgnoreCase(option))
					{
						rd.click();
						break;
					}
				}
			}
			public static void SelectCheckBox(WebDriver driver, By locator, String option)
			{
				List<WebElement> checkbox=driver.findElements(locator);
				for(WebElement ch:checkbox)
				{
					if(ch.getAttribute("value").equalsIgnoreCase(option))
					{
						if(!ch.isSelected())
						{
							ch.click();
							break;
						}
					}
				}
			}
			public static void selectDDByValue(WebDriver driver, By locator, String item)
			{
				boolean flag=false;
				Select dropdown=new Select(driver.findElement(locator));
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option : options)
				{
					if(option.getAttribute("value").equals(item))
					{
						flag=true;
						dropdown.selectByValue(item);
						break;
					}
				}
				if (flag==false)
				{
					System.out.println("Incorrect item given : " +item);
				}
			}
			public static void selectDDByText(WebDriver driver, By locator, String item)
			{
				boolean flag=false;
				Select dropdown=new Select(driver.findElement(locator));
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option : options)
				{
					if(option.getText().equals(item))
					{
						flag=true;
						dropdown.selectByVisibleText(item);
						break;
					}
				}
				if (flag==false)
				{
					System.out.println("Incorrect item given : " +item);
				}
			}
			public static void selectMenu(WebDriver driver, By menulocator, By sblocator ,String item)
			{
				WebElement menu= driver.findElement(menulocator);
				Actions builder=new Actions(driver);
				builder.moveToElement(menu).perform();
				List<WebElement> submenus=driver.findElements(sblocator);
				for(WebElement sb: submenus)
				{
					if(sb.getText().trim().equalsIgnoreCase(item))
					{
						sb.click();
						break;
					}
				}
			}
			public static void selectMenu(WebDriver driver, By menulocator, String menuitem, By sblocator , String sbitem)
			{
				List<WebElement> menus=driver.findElements(menulocator);
				Actions builder=new Actions(driver);
				for(WebElement menu:menus)
				{
					if(menu.getText().trim().equalsIgnoreCase(menuitem))
					{
						builder.moveToElement(menu).perform();
					}
				}
				List<WebElement> submenus=driver.findElements(sblocator);
				for(WebElement sb: submenus)
				{
					if(sb.getText().trim().equalsIgnoreCase(sbitem))
					{
						sb.click();
						break;
					}
				}
			}
	}
	


