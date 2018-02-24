package testPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	@BeforeTest
  	public void setUp(){
	 	System.setProperty("webdriver.chrome.driver","C:/Users/Qkan/Documents/selenium dependencies/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://google.com");
  	}
    
    @Test
    public void test(){
	    WebElement search_box = driver.findElement(By.name("q"));
	    search_box.sendKeys("porsche"+Keys.ENTER);
	    Assert.assertTrue(driver.getTitle().contains("porshe"));
    }
    
    @AfterTest
    	public void tearDown(){
    	driver.quit();
    }
}
