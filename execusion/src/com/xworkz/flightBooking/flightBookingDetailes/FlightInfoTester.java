package com.xworkz.flightBooking.flightBookingDetailes;

import com.xworkz.flightBooking.dto.FlightInfoDTO;
import com.xworkz.flightBooking.constants.Company;

import com.xworkz.flightBooking.bookingInfo.BookingInfo;

public class FlightInfoTester {
	public static void main(String[] args) {
		BookingInfo bookingInfo = new BookingInfo(50);
		FlightInfoDTO dto = new FlightInfoDTO("AIR234", 1987, "bangalore", Company.INDIGO);
		bookingInfo.acceptBookings(dto);
		bookingInfo.displayBookingInfo();

		FlightInfoDTO dto1 = new FlightInfoDTO("AIR897", 1767, "delhi", Company.SPICEJET);
		bookingInfo.acceptBookings(dto1);
		bookingInfo.displayBookingInfo();
		bookingInfo.displayBookingAtStartIndex("delhi");

		FlightInfoDTO dto2 = new FlightInfoDTO("AIRIND6578", 967, "delhi", Company.AIRINDIA);
		bookingInfo.acceptBookings(dto2);
		bookingInfo.displayBookingInfo();
		bookingInfo.displayBookingAtStartIndex("aish");

	}

}

