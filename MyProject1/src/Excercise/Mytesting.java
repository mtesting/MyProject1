package Excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mytesting {
	
	WebDriver driver;
	
	public void launch()
	{
		try{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://mail.yahoo.com");
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
	public void launchfirefox()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\firefox.exe");
		driver=new FirefoxDriver();
		driver.get("http://amazon.co.uk");
		
	}
	public void closedriver()
	{
		driver.quit();
	}
}
