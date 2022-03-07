package com.valencia.FibonacciNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class resultTest {
	
    /**
     * Tests if the Fibonacci Calculation is correct by asking the method to calculate the Fibonacci number of 10, which is 55
     * @return True of False depending on the results of the Test
     */
	
	@Test
	public void test() {

		App result = new App();
		int output = result.FibonacciCalculate(9);
	
		assertEquals(34, output);
	}

}
