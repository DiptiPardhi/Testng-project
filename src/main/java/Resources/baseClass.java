package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public WebDriver driver;

	public void intializeDriver() throws IOException {
		
		//To read the data
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KISHOR\\eclipse-workspace\\selenium22july\\src\\main\\java\\Resources\\data.properties");
		
		//acsess the data.properties file.
		
		Properties prop=new Properties();
		
		//loading  the readed file
		
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHOR\\OneDrive - Afcons\\Desktop\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			
			//firefox code
			
		}
		
		else if(browserName.equalsIgnoreCase("edge")){
			
			//edge code
			
		}
		
		else {
			
			System.out.println("please enter proper browser value");
		}
			
			
		
		
		

	}

}
