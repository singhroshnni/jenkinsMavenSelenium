package JenkinsMaven.Task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin {
	WebDriver driver;
	
	@Test(priority=0)
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
      
	}
	
	@Test(priority=1)
	
	public void TestCredentials() {
		WebElement user =driver.findElement(By.id("username"));
		WebElement pas =driver.findElement(By.id("password"));
		WebElement log =driver.findElement(By.id("submit"));
		user.sendKeys("student");
		pas.sendKeys("Password123");
		log.click();
		
		String expect="https://practicetestautomation.com/logged-in-successfully/";
		String actual=driver.getCurrentUrl();
		
		Assert.assertEquals(expect, actual);
		
	
	}

}
