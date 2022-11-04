package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;
import pageObjectmodule.LoginpageObjects;

public class verifyLogin extends baseClass {
	
	@Test
	public void login() throws IOException {
		
		intializeDriver();
		
		//This driver have scope
		
		 driver.get("https://login.salesforce.com/?locale=inl");
		 
		 LoginpageObjects obj = new LoginpageObjects(driver);
		 
		 obj.enterUsername().sendKeys("dipti");
		 
		 obj.enterPassword().sendKeys("1122");
		 
		 obj.clickOnLogin().click();
		 
		
	}

}
