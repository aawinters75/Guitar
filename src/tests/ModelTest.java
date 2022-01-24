/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Guitar;


public class ModelTest {

	
	Guitar myGuitar = new Guitar("Gretsch", "Hollow-body", "5420T");
	
	@Test
	public void test() {
		String testModel = "5420T";
		assertEquals(testModel, myGuitar.modelString());
	}

}
