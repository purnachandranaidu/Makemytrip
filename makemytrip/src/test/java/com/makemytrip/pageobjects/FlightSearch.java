package com.makemytrip.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightSearch {
	public WebDriver ldriver;
	public  FlightSearch(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath=".//*[@id='SW']/div[1]/div[2]/div/nav/ul/li[1]/a")WebElement flgtlink;
	@FindBy(xpath=".//*[@id='root']/div/div[2]/div/div[1]/ul/li[2]/span")WebElement roundtrip;
	@FindBy(xpath="(//INPUT[@type='text'])[1]")WebElement Fromcity;
	 
	@FindBy(xpath="(//INPUT[@type='text'])[3]")WebElement Tocity;
	@FindBy(xpath="//LABEL[@for='departure']")WebElement Depature;
	/*@FindBy(xpath="//LABEL[@for='return']")WebElement Aravile;*/
	
	@FindBy(xpath="(//P[text()='27'][text()='27'])[1]")WebElement Startdate;
	@FindBy(xpath="(//P[text()='3'][text()='3'])[3]")WebElement Returndate;
	@FindBy(xpath="//A[@class='primaryBtn font24 latoBlack widgetSearchBtn '][text()='Search']")WebElement searchbtn;
	
	public void Flightlink()
	{
		flgtlink.click();
	}
	
	public void trip()
	{
		roundtrip.click();
	}
	
	public void fcity()
	{
		Fromcity.sendKeys("Delhi");
		
	}
	public void tcity()
	{
		Tocity.sendKeys("Bangalore");
		
	}
	public void sdate()
	{
		Depature.click();
		Startdate.click();
	}
	public void rdate()
	{
		/*Aravile.click();*/
		Returndate.click();
	}
	public void searchflights()
	{
		searchbtn.click();
	}
}
