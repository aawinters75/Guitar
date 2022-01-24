/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
package model;


public class GuitarLogic {

	
	public boolean checkManufacturer(String manufacturer) {
		boolean isLegit = false;
		
		if(manufacturer == "Gretsch" || manufacturer == "Fender" || manufacturer == "Gibson") {
			isLegit = true;
		}
		return isLegit;
	}
	
	public boolean checkMake(String make) {
		boolean isLegit = false;
		
		if(make == "Hollow-body" || make == "Electric" || make == "Acoustic") {
			isLegit = true;
		}
		return isLegit;
	}
	
	public boolean checkModel(String model) {
		boolean isLegit = false;
		
		if(model == "5420T" || model == "Telecaster" || model == "J45") {
			isLegit = true;
		}
		return isLegit;
	}
}
