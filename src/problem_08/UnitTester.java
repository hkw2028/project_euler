package problem_08;

import org.junit.Test;

public class UnitTester {

	@Test
	public void test() {
		int[] testData = { 7,3,1,6,7,1,7,6,5,3,1,3,3,0,6,2,4,9,1,9,2,2,5,1,1,9,6,7,4,4,2,6,5,7,4,7,4,2,3,5,5,3,4,9,1,9,4,9,3,4 };
		// int[] testData = { 3,0,1,2,7,6,9,8,7,2,3 };
		MaxProductFinder unitTest = new MaxProductFinder( testData );
		unitTest.findAndStoreMaxProduct();
	}

}
