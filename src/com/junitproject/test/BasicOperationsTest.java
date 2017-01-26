/**
 * 
 */
package com.junitproject.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Teja
 *
 */
public class BasicOperationsTest {

	/**
	 * Test method for {@link com.junitproject.test.BasicOperations#addition(int, int)}.
	 */
	@Test
	public final void testAddition() {
		assertEquals("The sum is not equal to 2",2, BasicOperations.addition(1,1)); // TODO
	}

	/**
	 * Test method for {@link com.junitproject.test.BasicOperations#subtraction(int, int)}.
	 */
	@Test
	public final void testSubtraction() {
		assertEquals("The difference is not equal to 4", 4, BasicOperations.subtraction(6, 2));
		
	}

	/**
	 * Test method for {@link com.junitproject.test.BasicOperations#multiplication(int, int)}.
	 */
	@Test
	public final void testMultiplication() {
		assertEquals("The product is not equal to 12", 12, BasicOperations.multiplication(6, 2));
		
	
	}

	/**
	 * Test method for {@link com.junitproject.test.BasicOperations#division(int, int)}.
	 */
	@Test
	public final void testDivision() {
		assertEquals("The quotient is not equal to 3", 3, BasicOperations.division(6, 2));
		
	}

}
