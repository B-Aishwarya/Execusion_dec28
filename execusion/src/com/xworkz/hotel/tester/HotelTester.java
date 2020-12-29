package com.xworkz.hotel.tester;
import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.constants.HotelType;
import com.xworkz.hotel.constants.Location;
import com.xworkz.hotel.hotels.CityHotels;
import com.xworkz.hotel.constants.Location;

public class HotelTester {

	public static void main(String[] args) {
		String[] foodItems = {"dosa","idli","samosa","panipuri"};
		
		CityHotels city= new CityHotels(10);
		HotelDto dto =new HotelDto("Five star",Location.GANDHIBAJAR ,HotelType.CHINEASE,foodItems,"spoorti");
		city.acceptHotelInfo(dto);
		city.displayInfo();
		city.searchHotels("ayodhya", "hubli");
		
		
		HotelDto dto1 =new HotelDto("roti ghar","vena");
		city.acceptHotelInfo(dto1);
		city.displayInfo();
		city.displayOwnerName("vishalaxi");
		
		
		HotelDto dto2=new HotelDto("Haalli mane", Location.HSR, HotelType.INDIAN, foodItems,"Sanjiv");
		city.acceptHotelInfo(dto2);
		city.displayOwnerName("sanjeev");
		city.displayInfo();
	}

}

