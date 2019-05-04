package com.makemytrip.pageobjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FlightCount {
	public WebDriver ldriver;
	public  FlightCount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void Departureflights()
	{
		try {
			WebElement list=ldriver.findElement(By.xpath(".//*[@id='ow_domrt-jrny']/div[2]"));
			List<WebElement> options = list.findElements(By.xpath("(//P[@class='dept-city'][text()='New Delhi'][text()='New Delhi'])"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText().trim());
				options.get(i).getText();
				
				/*break;*/
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}

}
