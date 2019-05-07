package com.makemytrip.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.makemytrip.pageobjects.FlightCount;
import com.makemytrip.pageobjects.FlightSearch;

public class TC_Homepage_001 extends BaseClass {
	
	@Test(priority=1)
	public void Flightbooking()
	
	{
		try {

			FlightSearch search=new FlightSearch(driver);
			search.Flightlink();
			Thread.sleep(1000);
			search.trip();
			Thread.sleep(1000);
			search.fcity();
			Thread.sleep(1000);
			search.tcity();
			Thread.sleep(1000);
			search.sdate();
			Thread.sleep(1000);
			search.rdate();
			search.searchflights();
			Thread.sleep(1000);
			
			
			
		} catch (Exception e) {
			e.getMessage();
			
		}
		
	}
	
	

}
