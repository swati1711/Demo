package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Utilitities.TestUtils;

public class Ecommerce_BaseClass {

	public static WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		
		
		System.out.println("hello");
		 System.setProperty("webdriver.chrome.driver","/Users/ranjeetkendre/Downloads/chromedriver");
	
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		 
		 driver.get("https://demo.nopcommerce.com/login"); 
		 
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
