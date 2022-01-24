/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
package tests;
import model.Guitar;
import static org.junit.Assert.*;

import org.junit.Test;


public class MakeTest {
	String g1 = "Hollow-body";
	String g2 = "Electric";
	String g3 = "Acoustic";
	Guitar myGuitar = new Guitar("Gretsch", "Hollow-body", "5420T");

	@Test
	public void testMake() {
		String testMake = "Hollow-body";
		assertEquals(testMake, myGuitar.makeString());
	}

}
