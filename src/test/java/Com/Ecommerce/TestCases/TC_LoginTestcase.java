package Com.Ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;

public class TC_LoginTestcase extends Ecommerce_BaseClass{

	
	@Test
	public void LoginTestCase() {
		
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		
		TEL.SetUsername("ABC");
		TEL.SetPassword("XYZ");
		TEL.ClickButton();
		
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
