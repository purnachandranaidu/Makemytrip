package com.makemytrip.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.makemytrip.utility.ReadConfig;

public class BaseClass {
	ReadConfig config=new ReadConfig();
	
	public static WebDriver driver;
	public String url=config.getApplicationurl();
	
	@org.testng.annotations.Parameters("browser")
	@BeforeSuite
	public void SetUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedrive\\chromedriver.exe");
		// driver=new ChromeDriver();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--incognito");
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 driver = new ChromeDriver(capabilities);
		 driver.get(url);
		 
		 
		 //driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
		 driver.manage().deleteAllCookies();
		
		/*System.setProperty("webdriver.firefox.marionette", "F:\\chromedrive\\geckodriver.exe");
		 driver=new FirefoxDriver();*/
		
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.navigate().refresh();
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		
	}
	
	@AfterSuite(enabled=false)
	public void quit()
	{
		driver.close();
	}

}
