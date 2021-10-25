package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AffEefE5Lmz4azsUsmF8v4dUnXE9HZr8oZ61kxo6pNPUgEimoz9XkG309V34X5saXQplcS4Nf1QVqaU1TSH0eC0FQOwxGa823QeUjuKKthkEPQ&smuh=52750&lh=Ac8w7pzJ9ugYar0d9UY");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("9690332846");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Mishr@2407");
		driver.findElement(By.name("login")).click();

	}

}
