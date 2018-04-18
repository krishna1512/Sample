package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass2 {
	 @Test
	  public void test1() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		  WebDriver dr= new ChromeDriver();
		  
		//  System.setProperty("webdriver.chrome.driver","src\\main\\resources\\ch.exe");

		//WebDriver dr= new FirefoxDriver();
		 
			dr.navigate().to("http://www.rediff.com/");
			dr.manage().window().maximize();
			Thread.sleep(2000);
			dr.quit();

}
}
