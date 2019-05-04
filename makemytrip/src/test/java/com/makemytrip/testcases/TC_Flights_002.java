package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.makemytrip.pageobjects.FlightCount;

public class TC_Flights_002 extends BaseClass {
	
	@Test
	public void flights()
	{
		try {
			FlightCount count=new FlightCount(driver);
			count.Departureflights();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
