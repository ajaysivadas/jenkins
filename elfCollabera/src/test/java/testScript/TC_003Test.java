package testScript;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_003Test {
	@Test
	public void uberEats() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage () .window() .maximize();
			driver.manage (). timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get ("https://www.ubereats.com/");
			driver.quit();
}
}
