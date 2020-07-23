package com.enigma.pascal.java_unit_test;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorImlpTest {
	CalculatorInterface calc = new CalculatorImpl();
	Integer var1 = 4;
	Integer var2 = 2;

	@Test
	public void add_ShouldReturnInteger2_WhenParameterAIs1AndParameterBIs2() {

		Integer expected = var1 + var2;
		Integer actual = calc.add(var1, var2);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void min_ShouldReturnInteger2_WhenParameterAIs4AndParameterBIs2() {

		Integer expected = var1 - var2;
		Integer actual = calc.min(var1, var2);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void multiple_ShouldReturnInteger2_WhenParameterAIs4AndParameterBIs2() {

		Integer expected = var1 * var2;
		Integer actual = calc.multiple(var1, var2);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void divided_ShouldReturnInteger2_WhenParameterAIs4AndParameterBIs2() {

		Integer expected = var1 / var2;
		Integer actual = calc.divided(var1, var2);

		Assert.assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void divide_ShouldReturnInteger2_WhenParameterAIs4AndParameterBIs2() {
		Calculator calc = new Calculator();
		calc.divided(1, 0);
	}
}
