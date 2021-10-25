package testng;

import org.testng.annotations.Test;

import pom.pageextensions.RediffLogin;
import pom.pageextensions.RediffReg;
import utility.WebBrowser;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class RediffLoginTest {
	WebDriver driver;
	RediffLogin rlogin;
	RediffReg rreg;
  @Test
  public void tc01ValidLogin() {
	  System.out.println("tc01");
	  rlogin.login("admin", "admin");
	  rlogin.clearData();
  }
  @Test
  public void tc02InvalidLogin() {
	  System.out.println("tc02");
	  rlogin.login("guest", "guest");
	  assertEquals(rlogin.getError(), "Temporary Issue. Please try again later. [#5002]");
  }
  @Test
  public void tc03Register() {
	  rlogin.navigateToRegistration();
	  rreg.register("aaa", "aaa@gmail.com", "m", "India");
  }
  @BeforeClass
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
	  rlogin=new RediffLogin(driver);
	  rreg=new RediffReg(driver);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
