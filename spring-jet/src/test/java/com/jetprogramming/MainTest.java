package com.jetprogramming;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jetprogramming.varargs.Calculator;

public class MainTest {

	private Calculator calculator = new Calculator();

	@Test
	public void testSumCalculator() {
		assertEquals(10, calculator.sum(5, 5));
		assertEquals(0, calculator.sum());
		assertEquals(5, calculator.sum(1, 1, 1, 1, 1));
	}

}
