package com.enigma.pascal.java_unit_test;

public class CalculatorImpl implements CalculatorInterface {

	@Override
	public Integer add(Integer var1, Integer var2) {

		return var1 + var2;
	}

	@Override
	public Integer min(Integer var1, Integer var2) {

		return var1 - var2;
	}

	@Override
	public Integer multiple(Integer var1, Integer var2) {

		return var1 * var2;
	}

	@Override
	public Integer divided(Integer var1, Integer var2) {

		return var1 / var2;
	}

}
