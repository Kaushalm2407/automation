package utility;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebBrowser {

		public static WebDriver openBrowser(String url)
		{
			System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		}
		public static void verifyTitle(WebDriver driver, String exptitle)
		{
			String acttitle=driver.getTitle();
			if(acttitle.equals(exptitle))
			{
				System.out.println("Title mached");
			}
			else
				System.out.println("Title not mached");
		}
		
		
		public static WebElement isVisible(WebDriver driver, By by) {

			Wait<WebDriver> ft = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
					.pollingEvery(Duration.ofSeconds(60)).ignoring(NoSuchElementException.class);

			WebElement ele = ft.until(new Function<WebDriver, WebElement>() {

				@Override
				public WebElement apply(WebDriver driver) {

					return driver.findElement(by);
				}
			});

			return ele;

		}
		
		public static boolean isVisible(WebDriver driver, WebElement	e) {
			Wait<WebDriver> ft =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
					.pollingEvery(Duration.ofSeconds(60)).ignoring(NoSuchElementException.class);
			return  ft.until(ExpectedConditions.visibilityOf(e)).isDisplayed();

				
			

		}
		public static void takeScreenShot(WebDriver driver) {
			try {
				int month=LocalDate.now().getMonth().getValue();
				int day=LocalDate.now().getDayOfMonth();
				int hour=LocalDateTime.now().getHour();
				int min=LocalDateTime.now().getMinute();
				int sec=LocalDateTime.now().getSecond();
				
				String filename=month+""+day+""+hour+""+min+""+sec;
				
				
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destFile= new File(".//Screenshot//"+filename+".jpg");
				FileHandler.copy(srcFile, destFile);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public static void takeScreenShot(WebDriver driver,String	filename) {
			try {
				
				
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destFile= new File(".//Screenshot//"+filename+".jpg");
				FileHandler.copy(srcFile, destFile);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
}