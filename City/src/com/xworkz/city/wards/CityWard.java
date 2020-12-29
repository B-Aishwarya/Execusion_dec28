package com.xworkz.city.wards;

import com.xworkz.city.Constants.WardName;

public class CityWard {
	private CityWardDTO[] dtos;
	int currentIndex = 0;

	public CityWard(int size) {
		this.dtos = new CityWardDTO[size];
	}

	public void addWardInfo(CityWardDTO dto) {
		if (dto != null && this.currentIndex < 3) {
			System.out.println("add ward details");
			if (dto.getWardName() != null && dto.getWardNumber() > 0 && dto.getPopulation() > 5000
					&& dto.getArea() != null && dto.getClass() != null) {
				System.out.println("we can add ward info");
				System.out.println("current index is " + this.currentIndex);
				dtos[this.currentIndex] = dto;
				this.currentIndex++;
			}
		} else {
			System.out.println(" can not be add info");
		}

	}

	public void displayByNameOrNumber(WardName name, int wardNumber) {
		if (name != null || wardNumber > 0) {
			System.out.println("display by ward name and ward number");
			boolean start = false;
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null) {
					CityWardDTO ref = this.dtos[i];
					WardName localstart = ref.getWardName();
					int localnumber = ref.getWardNumber();
					if (name.equals(localstart) || wardNumber == localnumber) {
						start = true;
						System.out.println("ward name is  " + ref.getWardName());
						System.out.println("WardNumber is " + ref.getWardNumber());
						System.out.println("Area is" + ref.getArea());
						System.out.println("CorporatorName" + ref.getCorporatorName());
						System.out.println("Population is " + ref.getPopulation());

					}
				}
			}
			if (start == false) {
				System.out.println("starting point not found");

			}
		}
	}

	public void display() {
		for (int i = 0; i < dtos.length; i++) {
			CityWardDTO dto = this.dtos[i];
			if (this.dtos[i] != null) {
				System.out.println("Area is " + dto.getArea());
				System.out.println("CorporatorName is " + dto.getCorporatorName());
				System.out.println("Population is " + dto.getPopulation());
				System.out.println("WardName is " + dto.getWardName());
				System.out.println("WardNumber is " + dto.getWardNumber());
				System.out.println("***************************************");
			}
		}
	}

	public void displayCorporator(int wardNumber) {
		if (wardNumber > 0) {
			boolean start = false;
			for (int index = 0; index < this.dtos.length; index++) {
				if (this.dtos[index] != null) {
					System.out.println("displaying corporator name");
					CityWardDTO refOfstart = this.dtos[index];
					String localownerName = refOfstart.getCorporatorName();
					if (refOfstart.equals(localownerName)) {
						System.out.println("Corporator name is" + refOfstart.getCorporatorName());
						start = true;
						break;
					}
					if (start == false)
						System.out.println("Corporator name is not found");
					break;
				}
			}
		}

	}
}
