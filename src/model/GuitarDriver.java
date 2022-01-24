package model;
/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */


public class GuitarDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Guitar aaronsGuitar = new Guitar("Gretsch", "Hollow-body", "5420T");
		
		String output = aaronsGuitar.toString();
		System.out.println(output);
		
		output = aaronsGuitar.manufacturerString();
		System.out.println(output);
		
		output = aaronsGuitar.makeString();
		System.out.println(output);
		
		output = aaronsGuitar.modelString();
		System.out.println(output);

	}

}
