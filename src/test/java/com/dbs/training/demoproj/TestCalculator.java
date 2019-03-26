package com.dbs.training.demoproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int actualResult = c.add(23, 27);
		assertEquals(50, actualResult);
	}

	@Test
	public void testSub() {
		Calculator c = new Calculator();
		int actualResult = c.subtract(27, 27);
		assertEquals(0, actualResult);
	}

	@Test
	public void testSub1() {
		Calculator c = new Calculator();
		int actualResult = c.subtract(27, 28);
		assertEquals(-1, actualResult);
	}

}
