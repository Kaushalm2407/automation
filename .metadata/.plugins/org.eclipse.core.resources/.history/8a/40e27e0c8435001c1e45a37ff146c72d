package testng;

import org.testng.annotations.Test;

import utility.WebBrowser;
import utility.WebElementMethods;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class RediffTest {
	WebDriver driver;
  @Test(groups = {"pri1", "login"})
  public void invalidlogin() {
	  
	  String experror="Wrong username and password combination.";
	  WebElementMethods.entertext(driver, By.id("login1"),"testuser");
	  WebElementMethods.entertext(driver, By.id("password"),"testuser");
	  WebElementMethods.clickElement(driver, By.name("proceed"));
	  String acterror=driver.findElement(By.cssSelector("div#div_login_error>b")).getText();
	  assertEquals(acterror, experror);
  }

  @Test(groups = {"pri2", "login"})
  public void validlogin() {
	  
	  WebElementMethods.entertext(driver, By.id("login1"),"admin");
	  WebElementMethods.entertext(driver, By.id("password"),"admin");
	  WebElementMethods.clickElement(driver, By.name("proceed"));
	  System.out.println("Login successful");
	  
  }
	@AfterMethod(alwaysRun = true)
	public void afterMethod()
	{
		  driver.findElement(By.id("login1")).clear();
		  driver.findElement(By.id("password")).clear();
	}
  
  
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.close();
  }

}
