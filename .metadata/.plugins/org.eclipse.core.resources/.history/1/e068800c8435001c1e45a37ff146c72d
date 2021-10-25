package testng;


import utility.WebBrowser;
import utility.WebElementMethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class EchoTest {
	WebDriver driver;
	@Parameters({"username", "password"})
  @Test(priority = 0)
  public void guestlogin(@Optional("test1") String username,@Optional("test1") String password) {
	  WebElementMethods.entertext(driver, By.id("txtCustomerID"), username);
	  WebElementMethods.entertext(driver, By.id("txtPassword"), password);
	  WebElementMethods.clickElement(driver, By.id("Butsub"));
  }
	 @Test (dataProvider="getdata")
	  public void guestloginDDT(String username, String password) {
		  WebElementMethods.entertext(driver, By.id("txtCustomerID"), username);
		  WebElementMethods.entertext(driver, By.id("txtPassword"), password);
		  WebElementMethods.clickElement(driver, By.id("Butsub"));
		  assertEquals(driver.findElement(By.id("lblMsg")).getText(),"Invailid Username/Password");
	 }
	  //Returns a double dimensional array
	  //1st dimension is no of rows- no of times the test will be execute
	  //2nd dimension is no of cols- no of parameters sent to the method
	  @DataProvider
	  public String[][] getdata()
	  {
		  String[][] data=new String [3][2];
		  data[0][0]="user01";
		  data[0][1]="user01";
		  data[1][0]="user02";
		  data[1][1]="user02";
		  data[2][0]="user03";
		  data[2][1]="user03";
		  return data; 
	  }
	  @AfterMethod
	  public void clearData() {
		  driver.findElement(By.id("txtCustomerID")).clear();
		  driver.findElement(By.id("txtPassword")).clear();
	  }
	@Parameters({"empid", "epassword"})
	  @Test(priority = 1)
	  public void employeelogin(String empid, String epassword) {
		  driver.findElement(By.id("lbEmplogin")).click();
		  WebElementMethods.entertext(driver, By.id("ctl00_contentPlaceHolder_txtCustomerID"), empid);
		  WebElementMethods.entertext(driver, By.id("ctl00_contentPlaceHolder_txtPassword"), epassword);
		  WebElementMethods.clickElement(driver, By.id("ctl00_contentPlaceHolder_Butsub"));
	  }
  @BeforeClass
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
