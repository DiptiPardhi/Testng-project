package testCases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Resources.baseClass;
import pageObjectmodule.LoginpageObjects;
import pageObjectmodule.signUpPageObjects;

public class verifySignup extends baseClass{
	
	@Test
	public void signup() throws IOException, InterruptedException{
		
		
		intializeDriver();
		
		 driver.get("https://login.salesforce.com/?locale=inl");
			
		 LoginpageObjects LPO = new LoginpageObjects(driver);
		 
		LPO.clickOnTryForFree().click();
		
		signUpPageObjects SPO = new signUpPageObjects(driver);
		
		Thread.sleep(5000);
		
		SPO.enterFirstname().sendKeys("Dipti");
		
		SPO.enterLastname().sendKeys("Dere");
		
		WebElement e = SPO.selectEmployee();
		
		Select s = new Select(e);
		
		s.selectByIndex(1);
		
	}
	

}
