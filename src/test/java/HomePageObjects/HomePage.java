package HomePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath=".//*[@name='username']")WebElement username;
	
	public void TextUserName(String hostName) throws InterruptedException{
	 try {	
		 
		 username.sendKeys(hostName);  
		 System.out.println("Typed host name "+hostName); 
		 }catch(Throwable t) {
			System.out.println("Unable to enter HostName "+t);
			//screenshot(driver, "txt HostName");
			
		}
	}

}
