package com.xworkz.city;

import com.xworkz.city.wards.CityWardDTO;
import com.xworkz.city.Constants.WardName;
import com.xworkz.city.wards.CityWard;

public class wardTester {

	public static void main(String[] args) {
		
			CityWard ward=new CityWard(10);
			CityWardDTO dto=new CityWardDTO(7,WardName.BTM,5002,"1234","varsha");
			ward.addWardInfo(dto);
			ward.displayByNameOrNumber(WardName.BTM, 7);
			ward.display();
			ward.displayCorporator(7);
			
			
			
			 
			 
			
		}
	}

