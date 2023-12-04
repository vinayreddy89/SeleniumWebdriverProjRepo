package HomePage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCase extends BaseClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        String Actual=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        String Expected="Dashboard";
        
        if(Actual.equals(Expected))
        {
        	System.out.println("Testcase passes");
        }
        else
        {
        	System.out.println("failed");
        }
       String T= driver.getTitle();
       System.out.println(T);
      
      List<WebElement> index=driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']")); 
   
      for(int i = 0; i<index.size(); i++) {
          //obtain text
          String s = index.get(i).getText();
          System.out.println("Text is: " + s);
          }
      
      Thread.sleep(3000);
      driver.close();
   }
		
	}
        
       
	
	


