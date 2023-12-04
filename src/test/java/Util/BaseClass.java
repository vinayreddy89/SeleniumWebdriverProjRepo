package Util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
 WebDriver driver;
	public  WebDriver openBrowser(String browser) {
		
		if (browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if (browser.equals("Firefox")) 
		{
			driver= new FirefoxDriver();
			
		}
		else if (browser.equals("Edge")) 
		{
			driver= new EdgeDriver();
			
		}
		else if (browser.equals("safari")) 
		{
			driver= new SafariDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		return driver;
		
	}
	
}
