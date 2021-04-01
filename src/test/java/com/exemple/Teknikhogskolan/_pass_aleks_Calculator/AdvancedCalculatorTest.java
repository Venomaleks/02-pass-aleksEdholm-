package com.exemple.Teknikhogskolan._pass_aleks_Calculator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import java.awt.SecondaryLoop;
import java.text.DecimalFormat;

public class AdvancedCalculatorTest {

	AdvancedCalculatior aCC = new AdvancedCalculatior();
	
	BasicCalculator bCC = new BasicCalculator();
	
	Random rand = new Random();
	
	static DecimalFormat dc2 = new DecimalFormat("#.##");
	
	// Basic Calculator
	
	/*
	*/
	@Test
	public void addisonTest() {
		
		System.out.println("Addision");

		for (int i = 0; i < 5; i++) {
			
			double firstNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double secondNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = firstNumber + secondNumber;
			assertEquals(bCC.addision(firstNumber, secondNumber),result , 0);
			
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(bCC.addision(firstNumber, secondNumber)));
			
		}
		
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;
		assertEquals(bCC.addision(firstNumber, secondNumber),result , 0);
		
		System.out.println("result is :" + dc2.format(result));
		System.out.println("is eqouals to");
		System.out.println("result from function :" + dc2.format(bCC.addision(firstNumber, secondNumber)));
		
		System.out.println("");
	}
	
	
	
	
	@Test
	public void subbtractTest() {
		
		System.out.println("Subbtration");
		
		for (int i = 0; i < 5; i++) {
			
			double firstNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double secondNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = firstNumber - secondNumber;
			assertEquals(bCC.subbtract(firstNumber, secondNumber),result , 0);
			
			System.out.println("A : " + firstNumber + "    " + " B : " + secondNumber);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(bCC.subbtract(firstNumber, secondNumber)));
			
		}
		
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;
		assertEquals(bCC.subbtract(firstNumber, secondNumber),result , 0);
		
		System.out.println("result is :" + dc2.format(result));
		System.out.println("is eqouals to");
		System.out.println("result from function :" + dc2.format(bCC.subbtract(firstNumber, secondNumber)));
		
		System.out.println("");
		
	}
	
	
	@Test
	public void multyTest() {
		
		System.out.println("Multyplier");
		
		for (int i = 0; i < 5; i++) {
			
			double firstNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double secondNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = firstNumber * secondNumber;
			assertEquals(bCC.multy(firstNumber, secondNumber),result , 0);
			
			System.out.println("A : " + firstNumber + "    " + " B : " + secondNumber);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(bCC.multy(firstNumber, secondNumber)));
			
		}
		
		
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber * secondNumber;
		assertEquals(bCC.multy(firstNumber, secondNumber),result , 0);
		
		System.out.println("result is :" + dc2.format(result));
		System.out.println("is eqouals to");
		System.out.println("result from function :" + dc2.format(bCC.multy(firstNumber, secondNumber)));
		
		System.out.println("");
		
	}
	
	
	
	@Test
	public void devisonTest() {
		
		System.out.println("Devosion");
		
		for (int i = 0; i < 5; i++) {
			
			double firstNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double secondNumber = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = firstNumber / secondNumber;
	
			assertEquals(bCC.devision(firstNumber, secondNumber),result , 0);

			System.out.println("A : " + firstNumber + "    " + " B : " + secondNumber);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(bCC.devision(firstNumber, secondNumber)));
	
			
		}
		
		
			
		double firstNumber = rand.nextDouble() * -10;
		double secondNumber = 0;
		double result = firstNumber / secondNumber;
		assertEquals(bCC.devision(firstNumber, secondNumber),result , 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + bCC.devision(firstNumber, secondNumber));
		
		firstNumber = 0;
		secondNumber = 0;
		result = firstNumber / secondNumber;
		assertEquals(bCC.devision(firstNumber, secondNumber),result , 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + bCC.devision(firstNumber, secondNumber));
		
		System.out.println("");
		
	}
	
		
////////////////////////////////////////////////////////
	// Advancet Calculator
	
	
	
	@Test
	public void testSquare() {
		
		System.out.println("Square ");
		
		for (int i = 0; i < 5; i++) {
			
			double number = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = number * number;
			assertEquals(aCC.square(number),result, 0);
	
			System.out.println("A : " + number);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(aCC.square(number)));
		}
		
		double number = 0;
		double result = number * number;
		assertEquals(aCC.square(number),result, 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + aCC.square(number));
		
		
	}
	
	
	
	@Test
	public void sinusTest() {
		
		System.out.println("Sinus ");
		for (int i = 0; i < 5; i++) {

			double number = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = Math.sin(number);
			assertEquals(aCC.sinus(number),result, 0);
			
			System.out.println("A : " + number);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(aCC.sinus(number)));
		
		}
		
		double number = 0;
		double result = Math.sin(number);
		assertEquals(aCC.sinus(number),result, 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + aCC.sinus(number));
		
		
		System.out.println("");
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////
	// Look extra
	
	@Test
	public void resiedToThePowerOfTest() {
		
		System.out.println("To the power of ");
		System.out.println("");
		System.out.println("To the power of exponent range is 0");
		
		for (int i = 0; i < 5; i++) {
			
			double base = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double exponent = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double result = Math.pow(base, exponent);
			assertEquals(aCC.resiedToThePowerOf(base, exponent),result, 0);
			
			System.out.println("A : " + base + "    " + " B : " + exponent);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(aCC.resiedToThePowerOf(base, exponent)));
		
		}
		
		double base  = 0;
		double exponent = 0;
		double result = Math.pow(base, exponent);
		assertEquals(aCC.resiedToThePowerOf(base, exponent),result, 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + aCC.resiedToThePowerOf(base, exponent));
		System.out.println("");
		
		 
		
		System.out.println("");
	}
	
	
	@Test
	public void remainderTest() {
		
		System.out.println("Remainder ");

		for (int i = 0; i < 5; i++) {
			
			double devidend = (rand.nextDouble() *-10 + rand.nextDouble() *10);
			double divisor = (rand.nextDouble() *-10 + rand.nextDouble() *10);
				
			double result = devidend % divisor;
			assertEquals(aCC.remainder(devidend, divisor),result, 0);
				
			System.out.println("A : " + devidend + "    " + " B : " + divisor);
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(aCC.remainder(devidend, divisor)));
		
		
		}

		double devidend  = 0;
		double divisor = 0;
		double result = devidend % divisor;
		assertEquals(aCC.remainder(devidend, divisor),result, 0);
		
		System.out.println("result is :" + result);
		System.out.println("is eqouals to");
		System.out.println("result from function :" + aCC.remainder(devidend, divisor));
		System.out.println("");
		
		
	}	
	
	@Test
	public void inverseTest() {
		
		System.out.println("Inverse");
		System.out.println("-");
		for (int i = 0; i < 10; i++) {
			
			double number = (rand.nextDouble()*-10 + rand.nextDouble()*10);
			double result = 1 / number;
			assertEquals(aCC.inverse(number),result, 0);
			
			System.out.println("result is :" + dc2.format(result));
			System.out.println("is eqouals to");
			System.out.println("result from function :" + dc2.format(aCC.inverse(number)));
			
		}
		
			double number = 0;
			double result = 1 / number;
			assertEquals(aCC.inverse(number),result, 0);
			
			System.out.println("result is :" + result);
			System.out.println("is eqouals to");
			System.out.println("result from function :" + aCC.inverse(number));
			
		System.out.println("");
		
	}
	
}
