package pk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoblazeTest {
	WebDriver driver;
  @Test(enabled = true)
  public void flightbooking() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.ixigo.com/flights");
	  
  }
}
