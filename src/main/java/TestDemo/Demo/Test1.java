package TestDemo.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
	}
}
