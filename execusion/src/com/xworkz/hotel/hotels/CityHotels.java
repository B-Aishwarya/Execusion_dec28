package com.xworkz.hotel.hotels;
import com.xworkz.hotel.dto.HotelDto;

import java.util.Arrays;

import com.xworkz.flightBooking.dto.FlightInfoDTO;
import com.xworkz.hotel.constants.HotelType;

public class CityHotels {
	private HotelDto[] hotelDTO;
	private String services;
	private HotelType hotelType;
	private int currentIndex = 0;
	
	public CityHotels(int size) {
		hotelDTO =new HotelDto[size];
	}

	public void acceptHotelInfo(HotelDto dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("current index : " + this.currentIndex);
			System.out.println("accepting hotel info");
			this.hotelDTO[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("we cannot accept hotel info ");
			}
			if (dto != null) {
				System.out.println("cannot add more hotel information, total  " + this.currentIndex);
			}
			System.out.println("current index : " + this.currentIndex);
		}
	}

	public void searchHotels(String name, Location location) {

			if (name != null && location!=null) {
				System.out.println("searching for name " + name);
				boolean found = false;
				for (int index = 0; index < this.hotelDTO.length; index++) {
					HotelDto refOfCar = this.hotelDTO[index];
					String localModel = refOfCar.getName();
					if (localModel.equals(name)) {
						System.out.println("hotel is found");
						System.out.println(refOfCar.getName());
						System.out.println(refOfCar.getLocation());
						found = true;
						break;
					}
				}
				if (found == false) {
					System.out.println(name + " hotel is not found");
				}
			}
		}


	public void displayInfo() {
		for (int i = 0; i < this.hotelDTO.length; i++) {
			HotelDto dto = this.hotelDTO[i];
			if (dto != null) {
				System.out.println("displaying all hotel information");
				System.out.println("hotel name is "+dto.getName());
				System.out.println("owner name is "+dto.getOwnerName());
				System.out.println("location is "+dto.getLocation());
				System.out.println("food items are "+Arrays.toString(dto.getFoodItems()));
                System.out.println("********************************");
			}
		}
	}

	public void displayOwnerName(String ownerName) {
		if (ownerName != null) {
			boolean start = false;
			for (int index = 0; index < this.hotelDTO.length; index++) {
				if (this.hotelDTO[index] != null) {
					System.out.println("displaying owner name");
					HotelDto refOfstart = this.hotelDTO[index];
					refOfstart.setOwnerName("vishalaxi");
					String localownerName = refOfstart.getOwnerName();
					if (ownerName.equals(localownerName)) {
						System.out.println("owner name is" + refOfstart.getOwnerName());
						start = true;
						break;
					}
					if (start == false)
						System.out.println("owner name is not found");
					break;
				}
			}
		}

	}
}
