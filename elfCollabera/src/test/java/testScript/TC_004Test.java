package testScript;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_004Test {
	@Test
	public void dominos() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/ajaysivadas/Downloads/Selenium Files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage () .window() .maximize();
		driver.manage (). timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get ("https://www.dominos.com/");
		driver.quit();
	}
}

