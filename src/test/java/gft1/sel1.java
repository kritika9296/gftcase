package gft1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {
	public static WebDriver driver;
	public static WebDriver configure_details()
	{
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");

	        driver = new ChromeDriver();
		return driver;
	}
}





