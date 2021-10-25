package testng;

import org.testng.annotations.Test;

import utility.WebBrowser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class GoogleLinkTest {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Google");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test Google");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Google");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test Google");
	}
	
  @Test (priority=2 , groups = {"pri2" ,"search"})
  public void about() {
	  driver.findElement(By.linkText("About")).click();
	  WebBrowser.verifyTitle(driver, "Google - About Google, Our Culture &amp; Company News");
//	  assertTrue(driver.getTitle().contains("Google - About Google, Our Culture &amp; Company News"), "Title Mismatch");
  }
  @Test(priority=1, groups = {"pri2" ,"search"})
  public void advertising()
  {
	  driver.findElement(By.linkText("Advertising")).click();
	  WebBrowser.verifyTitle(driver, " Get More Customers With Easy Online Advertising | Google Ads");
  }
  @Test(priority=0 , groups = {"pri1" ,"search"})
  public void imageSearch()
  {
	  driver.findElement(By.linkText("Images")).click();
	  WebBrowser.verifyTitle(driver, "Google Images");
  }
  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  driver.navigate().back();
  }

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  driver= WebBrowser.openBrowser("https://www.google.com");
  }

  @AfterClass (alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
