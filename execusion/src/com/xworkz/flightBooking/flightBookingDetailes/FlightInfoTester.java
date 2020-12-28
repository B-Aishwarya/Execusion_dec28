package com.xworkz.flightBooking.flightBookingDetailes;

import com.xworkz.flightBooking.dto.FlightInfoDTO;
import com.xworkz.flightBooking.constants.Company;

import com.xworkz.flightBooking.bookingInfo.BookingInfo;

public class FlightInfoTester {
	public static void main(String[] args) {
		BookingInfo bookingInfo = new BookingInfo(50);
		FlightInfoDTO dto = new FlightInfoDTO("AIR234", 1987, "udupi", Company.INDIGO);
		bookingInfo.acceptBookings(dto);
		bookingInfo.displayBookingInfo();
		bookingInfo.displayBookingAtStartIndex("udupi");

	}

}
