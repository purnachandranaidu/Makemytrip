package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.makemytrip.pageobjects.Flight_Select_radio;

public class TC_Flights_Radio_004 extends BaseClass {
	
	@Test(priority=4)
	public void Radio()
	{
		Flight_Select_radio rdaiobtn=new Flight_Select_radio(driver);
		rdaiobtn.Departureflights_Radio();
	}

}
