package com.xworkz.flightBooking.bookingInfo;

import com.xworkz.flightBooking.dto.FlightInfoDTO;

public class BookingInfo {
	private FlightInfoDTO[] flightInfoDto;
	private int currentIndex = 0;

	public BookingInfo(int size) {
		flightInfoDto = new FlightInfoDTO[size];
	}

	public void acceptBookings(FlightInfoDTO dto) {
		System.out.println("Accepting the Flight Booking ");
		if (dto != null && this.currentIndex < 5) {
			System.out.println("we can book thicket");
			System.out.println("current index : " + this.currentIndex);
			this.flightInfoDto[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (flightInfoDto == null) {
				System.out.println("we cannot book the thicket ");
			}
			if (flightInfoDto != null) {
				System.out.println("cannot book thicket, total  " + this.currentIndex);
			}
			System.out.println("current index : " + this.currentIndex);
		}
	}

	public void displayBookingInfo() {
		System.out.println("Displaying all the Booking detailes");
		for (int i = 0; i < this.flightInfoDto.length; i++) {
			FlightInfoDTO flightInfoDto = this.flightInfoDto[i];
			if (flightInfoDto != null) {
				System.out.println("airplane code is " + flightInfoDto.getAirplaneCode());
				System.out.println("Business Class price is " + flightInfoDto.getBusinessClassprice());
				System.out.println("company name is " + flightInfoDto.getCompany());
				System.out.println("start point is " + flightInfoDto.getStartingPoint());
				System.out.println("***************************");

			}
		}
	}

	public void displayBookingAtStartIndex(String startingPOint) {
		if (startingPOint != null) {
			boolean start = false;

			for (int index = 0; index < this.flightInfoDto.length; index++) {
				if (this.flightInfoDto[index] != null) {
					System.out.println("displaying starting point");
					FlightInfoDTO refOfstart = this.flightInfoDto[index];
					String localstartingPOint = refOfstart.getStartingPoint();
					if (startingPOint.equals(localstartingPOint)) {
						System.out.println("starting point is found" + refOfstart.getStartingPoint());
						System.out.println("destination point is" + refOfstart.getDestination());
						System.out.println("EconomyClassPrice is " + refOfstart.getEconomyClassPrice());
						start = true;
						break;
					}
					if (start == false)
						System.out.println("starting point is not found");
					break;
				}
			}
		}
	}
}
