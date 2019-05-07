package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.makemytrip.pageobjects.FlightCount;

public class TC_Flights_002 extends BaseClass {
	
	@Test(priority=2)
	public void flights()
	{
		try {
			FlightCount count=new FlightCount(driver);
			count.Departureflights();
			count.Returnflights();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
