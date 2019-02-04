package Project.GolfGameFinalCorrection;

import org.junit.Test;

import Project.GolfGameFinalCorrection.utility.Distance_Calculation;
import junit.framework.Assert;

public class Test_ {
	
	@Test
	
	public void test_velocity() {
		
		int velocity = 100;
		int angle = 20;
		
		
		// expected result

		int expected = 655;

		// actual value
		
		int actual = Distance_Calculation.Distance(velocity, angle);
		Assert.assertEquals(expected, actual, 0);
	}
}
