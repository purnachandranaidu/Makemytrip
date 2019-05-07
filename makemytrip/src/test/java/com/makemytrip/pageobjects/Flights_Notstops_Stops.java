package com.makemytrip.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights_Notstops_Stops {
	WebDriver ldriver;
	public Flights_Notstops_Stops(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath=".//*[@id='fli_filter__stops']/span[1]/label/span[1]")WebElement Checkbox1;
	@FindBy(xpath=".//*[@id='fli_filter__stops']/span[2]/label/span[1]/span")WebElement Checkbox2;
	
	
	public void NonStop()
	{
		try {
			
			Checkbox1.click();
			WebElement list=ldriver.findElement(By.xpath("//div[@id='ow_domrt-jrny']"));
			
			List<WebElement> options = list.findElements(By.xpath("(//div[@id='ow_domrt-jrny']//label//span[2])"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
				options.get(i).getText();	
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}
	
	
	public void Stop()
	{
		try {
			
			Checkbox2.click();
			
			Checkbox1.click();
			WebElement list=ldriver.findElement(By.xpath("//div[@id='rt-domrt-jrny']"));
			
			List<WebElement> options = list.findElements(By.xpath("(//div[@id='rt-domrt-jrny']//label//span[2])"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
				options.get(i).getText();	
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}
	
	

}
