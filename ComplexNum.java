/**
 * @author Camby Abell
 * @assignment assg5_Abell
 * @filename ComplexNum.java
 */

package assg5_Abell;

public class ComplexNum 
{
	private double realNum, imgNum;
	
	/**
	 * This constructor uses no parameters and will initially set both the
	 * realNum and imgNum variables of a complex number to 0.
	 */
	public ComplexNum()
	{
		realNum = 0;
		imgNum  = 0;
	}
	
	/**
	 * This constructor will only be used if there is one parameter given
	 * initially, e.g. ComplexNum(a).
	 * @param a - the real number of a complex number.
	 */
	public ComplexNum(double a)
	{
		realNum = a;
		imgNum  = 0;
	}
	
	/**
	 * This constructor will only be used if there is two parameters given
	 * initially, e.g. ComplexNum(a, b).
	 * @param a - the real number of a complex number.
	 * @param b - the imaginary number of a complex number.
	 */
	public ComplexNum(double a, double b)
	{
		realNum = a;
		imgNum  = b;
	}
	
	/**
	 * getReal() returns the real number in a ComplexNum object.
	 * @return realNum
	 */
	public double getReal()
	{
		return realNum;
	}
	
	/**
	 * getImaginary() returns the imaginary number in a ComplexNum object.
	 * @return imgNum
	 */
	public double getImaginary()
	{
		return imgNum;
	}
	
	/**
	 * setReal() sets the value of the real number in a ComplexNum object.
	 * @param a - the real number of a complex number.
	 */
	public void setReal(double a)
	{
		realNum = a;
	}
	
	/**
	 * setImaginary() sets the value of the imaginary number in a ComplexNum
	 * object.
	 * @param b - the imaginary number of a complex number.
	 */
	public void setImaginary(double b)
	{
		imgNum = b;
	}
	
	/**
	 * add(num) adds num and a ComplexNum.
	 * @param num - a ComplexNum object
	 * @return c - a new ComplexNum equal to this + num
	 */
	public ComplexNum add(ComplexNum num)
	{
		double a = (this.getReal() + num.getReal());
		double b = (this.getImaginary() + num.getImaginary());
		return new ComplexNum(a, b);
	}
	
	/**
	 * sub(num) subtracts num from a ComplexNum.
	 * @param num - a ComplexNum object
	 * @return c - a new ComplexNum equal to this - num
	 */
	public ComplexNum sub(ComplexNum num)
	{
		double a = (this.getReal() - num.getReal());
		double b = (this.getImaginary() - num.getImaginary());
		return new ComplexNum(a, b);
	}

	/**
	 * mul(num) multiplies num and a ComplexNum.
	 * @param num - a ComplexNum object
	 * @return c - a new ComplexNum equal to this * num
	 */
	public ComplexNum mul(ComplexNum num)
	{
		double a = ((this.getReal() * num.getReal()) 
				     - (this.getImaginary() * num.getImaginary()));
		
		double b = ((this.getReal() * num.getImaginary()) 
					 + (this.getImaginary() * num.getReal()));
		
		return new ComplexNum(a, b);
	}
	
	/**
	 * neg() negates a ComplexNum.
	 * @return c - the negated ComplexNum
	 */
	public ComplexNum neg()
	{
		double a = 0;
		double b = 0;
		
		if(this.getReal() != 0)
		{
			a = (this.getReal() * -1);
		}
		
		if(this.getImaginary() != 0)
		{
			b = (this.getImaginary() * -1);
		}
			
		return new ComplexNum(a, b);
	}
	
	/**
	 * toString() properly formats a complex number.
	 * @return the properly formatted output of a complex number
	 */
	public String toString()
	{
		double a = this.getReal();
		double b = this.getImaginary();
		
		if(a == 0 && b != 0)
		{
			return String.valueOf(b) + "i";
		}
		else if (b == 0 && a != 0)
		{
			return String.valueOf(a);
		}
		else if(b > 0)
		{
			return String.valueOf(a) + "+" + String.valueOf(b) + "i";
		}
		else if(b < 0)
		{
			return String.valueOf(a) + String.valueOf(b) + "i";
		}
		
		return "All integers are 0.";
	}
	
	/**
	 * equals(num) checks if two ComplexNum objects are equal.
	 * @param num - a ComplexNum object.
	 * @return true - if the two complex numbers are equal.
	 * @return false - if the two complex numbers are not equal.
	 */
	public boolean equals(Object obj)
	{
		if(obj instanceof ComplexNum)
		{
			ComplexNum newNum = new ComplexNum(((ComplexNum) obj).getReal(), 
											  ((ComplexNum) obj).getImaginary());
			
			if(this.getReal() == newNum.getReal() 
			   && this.getImaginary() == newNum.getImaginary())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}

