package com.exemple.Teknikhogskolan._pass_aleks_Calculator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {

	AdvancedCalculatior aCC = new AdvancedCalculatior();
	
	Random rand = new Random();
	
	@Test
	public void testSquare() {
		
		for (int i = 0; i < 5; i++) {
			
			double number = rand.nextDouble();
			
			double result = number * number;
			
			assertEquals(aCC.square(number),result, 0);
		}

	}
	
	@Test
	public void sunusTest() {
		
		
		for (int i = 0; i < 5; i++) {

			double number = rand.nextDouble();
			
			double result = Math.sin(number);
			
			assertEquals(aCC.sinus(number),result, 0);
		}
		
	}
	
	@Test
	public void resiedToThePowerOfTest() {
		
		for (int i = 0; i < 5; i++) {
			
			double base = rand.nextDouble();
			
			double exponent = rand.nextDouble();
			
			double result = Math.pow(base, exponent);
			
			assertEquals(aCC.resiedToThePowerOf(base, exponent),result, 0);
			
		}
		
	}
	
	@Test
	public void remainderTest() {
		
		for (int i = 0; i < 5; i++) {
			
			double devidend = rand.nextDouble();
			
			double divisor = rand.nextDouble();
			
			double result = devidend % divisor;
			
			assertEquals(aCC.remainder(devidend, divisor),result, 0);
		}
		
	}
	
	@Test
	public void inverseTest() {
		
		for (int i = 0; i < 5; i++) {
			
			double number = rand.nextDouble();
			
			double result = 1 / number;
			
			assertEquals(aCC.inverse(number),result, 0);
			
		}
		
	}

}
