package com.xworkz.flightBooking.dto;

import com.xworkz.flightBooking.constants.Company;

public class FlightInfoDTO {
	private String airplaneCode;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassprice;
	private double economyClassPrice;
	private Company company;

	public FlightInfoDTO() {
		System.out.println("init FlightInfoDTO");
	}

	public FlightInfoDTO(String airplaneCode, double businessClassprice, String startingPoint, Company company) {
		this.airplaneCode = airplaneCode;
		this.businessClassprice = businessClassprice;
		this.startingPoint = startingPoint;
		this.company = company;

	}

	public Company getCompany() {
		return company;
	}

	public void setCompnay(Company company) {
		this.company = company;
	}

	public String getAirplaneCode() {
		return airplaneCode;
	}

	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public double getBusinessClassprice() {
		return businessClassprice;
	}

	public void setBusinessClassprice(double businessClassprice) {
		this.businessClassprice = businessClassprice;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}

}
