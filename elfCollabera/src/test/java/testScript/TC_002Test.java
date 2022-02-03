package testScript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC_002Test {
	@Test
	public void zomato() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage () .window() .maximize();
			driver.manage (). timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get ("https://www.zomato.com/");
			driver.quit();
}
}

