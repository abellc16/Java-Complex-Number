/**
 * @author Camby Abell
 * @assignment assg5_Abell
 * @filename TestComplexNum.java
 */

package assg5_Abell;
import junit.framework.TestCase;

public class TestComplexNum extends TestCase
{
	// Declare ComplexNum objects
	protected ComplexNum num1, num2, num3;
	
	/**
	 * setUp() is used to reinitialize my two ComplexNum object back to:
	 * num1 = 1.0 + 1.0i 
	 * num2 = 1.0 + 1.0i
	 */
	protected void setUp()
	{
		num1 = new ComplexNum(1.0, 1.0);
		num2 = new ComplexNum(1.0, 1.0);
		num3 = new ComplexNum(2.0, 2.0);
	}
	
	/**
	 * testDefCons() tests the default constructor by setting both the
	 * real number and the imaginary number to 0.
	 */
	public void testDefCons()
	{
		num1 = new ComplexNum();
		assertTrue(num1.getReal() == 0);
		assertEquals(0.0, num1.getImaginary());
	}
	
	/**
	 * testOneParamCons() tests the constructor using one parameter. The one
	 * parameter will set the real number to whatever is specified. 
	 */
	public void testOneParamCons()
	{
		num1 = new ComplexNum(10.123);
		assertTrue(num1.getReal() == 10.123);
		assertEquals(0.0, num1.getImaginary());
	}
	
	/**
	 * testTwoParamCons() tests the constructor using two parameters. The
	 * first parameter will set the real number and the second parameter
	 * will set the imaginary number.
	 */
	public void testTwoParamCons()
	{
		num1 = new ComplexNum(7.963, 1101.65444);
		assertTrue(num1.getReal() == 7.963);
		assertEquals(1101.65444, num1.getImaginary());
	}
	
	/**
	 * testGetReal() tests the getReal method.
	 */
	public void testGetReal()
	{
		assertTrue(num1.getReal() == 1.0);
	}
	
	/**
	 * testGetImaginary() tests the getImaginary method.
	 */
	public void testGetImaginary()
	{
		assertTrue(num2.getImaginary() == 1.0);
	}
	
	/**
	 * testSetReal() tests the setReal method.
	 */
	public void testSetReal()
	{
		num1.setReal(1.5);
		assertTrue(num1.getReal() == 1.5);
	}
	
	/**
	 * testSetImaginary() tests the setImaginary method.
	 */
	public void testSetImaginary()
	{
		num2.setImaginary(5.789);
		assertTrue(num2.getImaginary() == 5.789);
	}
	
	/**
	 * testAdd() tests the add method by adding num1 and num2 together and
	 * storing the sum into a new ComplexNum 'result'.
	 */
	public void testAdd()
	{
		ComplexNum result = num1.add(num2);
		assertTrue(result.getReal() == 2.0);
		assertTrue(result.getImaginary() == 2.0);
		
		assertTrue(num1.getReal() == 1.0);
		assertTrue(num2.getImaginary() == 1.0);
	}
	
	/**
	 * testSub() tests the sub method by subtracting num1 from num2. The
	 * difference will then be stored into a new ComplexNum 'result'.
	 */
	public void testSub()
	{
		ComplexNum result = num1.sub(num2);
		assertTrue(result.getReal() == 0.0);
		assertTrue(result.getImaginary() == 0.0);
		
		result = num3.sub(num2);
		assertEquals(1.0, result.getReal());
	}
	
	/**
	 * testMul() tests the mul method by multiplying num1 and num2 together. The
	 * product is then stored into a new ComplexNum 'result'.
	 */
	public void testMul()
	{
		ComplexNum result = num1.mul(num2);
		assertTrue(result.getReal() == 0.0);
		assertTrue(result.getImaginary() == 2.0);
		
		result = num3.mul(num1);
		assertEquals(0.0, result.getReal());
	}
	
	/**
	 * testNeg() tests the neg method by negating a ComplexNum and storing
	 * the new negated number into a new ComplexNum 'result'.
	 */
	public void testNeg()
	{
		ComplexNum result = num1.neg();
		assertEquals(-1.0, result.getReal());
		assertEquals(-1.0, result.getImaginary());
		
		result = num3.neg();
		assertTrue(result.getReal() == -2.0);
		assertFalse(result.getImaginary() == 10.2);
	}
	
	/**
	 * testToString() tests the toString method by calling on it using an
	 * existing ComplexNum and storing the string into a string variable
	 * 'result'.
	 */
	public void testToString()
	{
		String result = num1.toString();
		assertTrue(result.equals(num1.toString()));
		assertFalse(result.equals(num3.toString()));
	}
	
	/**
	 * testEquals() will test if equals method works by comparing two identical
	 * ComplexNum objects and two different ComplexNum objects.
	 */
	public void testEquals()
	{
		boolean result = num1.equals(num2);
		assertTrue(result == true);
		
		result = num2.equals(num3);
		assertTrue(result == false);
	}
}

