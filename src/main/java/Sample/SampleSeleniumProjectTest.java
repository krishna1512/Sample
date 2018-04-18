package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class SampleSeleniumProjectTest {
	
	WebDriver dr;
	 
	 
	 
 
  @Test
  public void test1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kvenkumahanthi\\Downloads\\chrome\\chromedriver.exe");
		
		WebDriver dr= new ChromeDriver();
		dr.navigate().to("http://toolsqa.com/selenium-webdriver/send-reports-automatically-to-email-using-maven-from-eclipse/");
		dr.manage().window().maximize();
  }
  



  
}
