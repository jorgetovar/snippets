package com.jetprogramming.varargs;

public class Calculator {

	// varargs
	public int sum(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		return sum;
	}

}
