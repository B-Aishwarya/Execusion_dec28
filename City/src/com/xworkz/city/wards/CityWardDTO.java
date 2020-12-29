package com.xworkz.city.wards;
import com.xworkz.city.Constants.WardName;

public class CityWardDTO {
	 private int wardNumber;
	    private WardName wardName;
	    private String corporatorName;
	    private int population;
	    private String area;
	    
	    /**
		 * 
		 */
		public CityWardDTO() {
			System.out.println("invoked cityward");
		}
		/**
		 * @param wardNumber
		 * @param wardName
		 * @param population
		 */
		public CityWardDTO(int wardNumber, WardName wardName, int population,String area,String corporatorName) {
			this.wardNumber = wardNumber;
			this.wardName = wardName;
			this.population = population;
			this.area=area;
			this.corporatorName=corporatorName;
		}
		public int getWardNumber() {
			return wardNumber;
		}
		public void setWardNumber(short wardNumber) {
			this.wardNumber = wardNumber;
		}
		public WardName getWardName() {
			return wardName;
		}
		public void setWardName(WardName wardName) {
			this.wardName = wardName;
		}
		public String getCorporatorName() {
			return corporatorName;
		}
		public void setCorporatorName(String corporatorName) {
			this.corporatorName = corporatorName;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}

}
