package com.valencia.FibonacciNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class resultTest {

	@Test
	public void test() {

		App result = new App();
		int output = App.FibonacciCalculate(10);
	
		assertEquals(55, output);
	}

}
