package model;
/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */

/**
 * @author winte
 *
 */
public class Guitar {
	private String manufacturer;
	private String make;
	private String model;
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	public Guitar() {
		manufacturer = "Unknown";
		make = "Unknown";
		model = "Unknown";
	}
	/**
	 * @param name
	 * @param monthlySalary
	 * @param age
	 */
	public Guitar(String manufacturer, String make, String model) {
		super();
		this.manufacturer = manufacturer;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Guitar [manufacturer=" + manufacturer + ", make=" + make + ", model=" + model + "]";
	}
	
	public String manufacturerString() {
		return manufacturer;
	}
	
	public String makeString() {
		return make;
	}
	
	public String modelString() {
		return model;
	}

}
