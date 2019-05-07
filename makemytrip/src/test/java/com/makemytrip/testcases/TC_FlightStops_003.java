package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.makemytrip.pageobjects.Flights_Notstops_Stops;

public class TC_FlightStops_003 extends BaseClass {
	
	@Test(priority=3)
	public void Flight_Stops()
	{
		Flights_Notstops_Stops stops=new Flights_Notstops_Stops(driver);
		stops.NonStop();
		stops.Stop();
	}

}
