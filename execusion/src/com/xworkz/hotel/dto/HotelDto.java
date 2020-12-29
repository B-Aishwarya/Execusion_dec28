package com.xworkz.hotel.dto;
import com.xworkz.hotel.constants.Location;
import com.xworkz.hotel.constants.HotelType;

public class HotelDto {
	private String name;
	private Location location;
	private HotelType type;
	private String ownerName;
	private String[] foodItems;

	/**
	 * @param name
	 * @param ownerName
	 */
	public HotelDto(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	/**
	 * @param name
	 * @param location
	 */
	public HotelDto(String name, Location location,HotelType type, String[] foodItems,String ownerName) {
		super();
		this.name = name;
		this.location = location;
		this.foodItems = foodItems;
		this.type=type;
		this.ownerName = ownerName;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}


