/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
package tests;

import model.Guitar;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ MakeTest.class, ManufacturerTest.class, ModelTest.class })
public class AllTests {

}
