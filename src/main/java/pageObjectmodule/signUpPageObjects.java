package pageObjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {
	
	public WebDriver driver;
	
	By firstname = By.xpath("//input[@name='UserFirstName']");
	
	By lastname = By.xpath("//input[@name='UserLastName']");
	
	By employee = By.xpath("//select[@name='CompanyEmployes']");
	
	public signUpPageObjects(WebDriver driver2) {
	
        this.driver=driver2;
}
	
	public WebElement enterFirstname() {
		return driver.findElement(firstname);
		
	}
	
	public WebElement enterLastname() {
		return driver.findElement(lastname);
		
	}
	
	public WebElement selectEmployee() {
		return driver.findElement(employee);
		
	}
	
}
