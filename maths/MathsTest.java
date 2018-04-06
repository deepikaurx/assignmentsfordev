package maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsTest {

	@Test
	public void testaddition() {
		assertEquals(12, Maths.addition(10, 2));
		assertEquals(22, Maths.addition(20, 2));
		assertEquals(32, Maths.addition(30, 2));
	}

	@Test
	public void testtimes() {
		assertEquals(20, Maths.times(10, 2));
		assertEquals(40, Maths.times(20, 2));
		assertEquals(60, Maths.times(30, 2));
	}

	@Test
	public void testdivide() {
		assertEquals(5, Maths.divide(10, 2));
		assertEquals(10, Maths.divide(20, 2));
		assertEquals(15, Maths.divide(30, 2));
	}

	@Test
	public void testsubtract() {
		assertEquals(8, Maths.subtract(10, 2));
		assertEquals(18, Maths.subtract(20, 2));
		assertEquals(28, Maths.subtract(30, 2));
	}

}
