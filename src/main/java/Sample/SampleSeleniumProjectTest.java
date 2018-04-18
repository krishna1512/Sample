package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class SampleSeleniumProjectTest {
	
	WebDriver dr;
	 
	 
	 
 
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
	  WebDriver dr= new ChromeDriver();
	  
	//  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\ch.exe");

	//WebDriver dr= new FirefoxDriver();
	 
		dr.navigate().to("http://toolsqa.com/selenium-webdriver/send-reports-automatically-to-email-using-maven-from-eclipse/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.quit();
		
		//hgyugfuygmai
		
  }
  
 /* @AfterTest
	public void final()
	{
		dr.quit();
	}
*/

  
}
