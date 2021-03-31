package com.exemple.Teknikhogskolan._pass_aleks_Calculator;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {


	BasicCalculator bCC = new BasicCalculator();
	
	Random rand = new Random();
	
	
	@Test
	public void addisonTest() {
		
		double firstNumber = rand.nextDouble();
		
		double secondNumber = rand.nextDouble();
		
		double result = firstNumber + secondNumber;
	
		assertEquals(bCC.addision(firstNumber, secondNumber), result, 0);
		
	}
	
	
	@Test
	public void subbtractTest() {
		
		double firstNumber = rand.nextDouble();
		
		double secondNumber = rand.nextDouble();
		
		double result = firstNumber - secondNumber;
		
		assertEquals(bCC.subbtract(firstNumber, secondNumber),result , 0);
		
		
	}
	
	@Test
	public void multyTest() {
		
		double firstNumber = rand.nextDouble();
		
		double secondNumber = rand.nextDouble();
		
		double result = firstNumber * secondNumber;
		
		assertEquals(bCC.multy(firstNumber, secondNumber),result , 0);
		
	}
	
	@Test
	public void devisonTest() {
		
		double firstNumber = rand.nextDouble();
		
		double secondNumber = rand.nextDouble();
		
		double result = firstNumber / secondNumber;
		
		assertEquals(bCC.devision(firstNumber, secondNumber),result , 0);
		
		
	}

}
