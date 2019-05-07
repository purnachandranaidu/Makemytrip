package com.makemytrip.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_Select_radio {
	
	WebDriver ldriver;
	public Flight_Select_radio(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	//@FindBy(xpath=".//*[@id='ow_domrt-jrny']//span[@class='splitVw-outer append_right9']")WebElement Radio;
	
	
	public void Departureflights_Radio()
	{
		try {
			WebElement list=ldriver.findElement(By.xpath("//div[@id='ow_domrt-jrny']"));
			
			List<WebElement> options = list.findElements(By.xpath(".//*[@id='ow_domrt-jrny']//span[@class='splitVw-outer append_right9']"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				options.get(10).click();
				System.out.println(options.get(10).getText());
				
				
				
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}

}
