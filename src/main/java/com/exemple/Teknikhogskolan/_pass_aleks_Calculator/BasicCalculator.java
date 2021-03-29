package com.exemple.Teknikhogskolan._pass_aleks_Calculator;

import com.exemple.Teknikhogskolan._pass_aleks_Calculator_interface.BasicOperations;

public class BasicCalculator implements BasicOperations   {

	@Override
	public double addision(double firstNumber, double secondNumber) {
		
		double result = firstNumber + secondNumber;
		
		return result;
	}

	
	@Override
	public double subbtract(double firstNumber, double secondNumber) {
		
		double result = firstNumber - secondNumber;
		
		return result;
	}

	
	@Override
	public double multy(double firstNumber, double secondNumber) {
		
		double result = firstNumber * secondNumber;
		
		return result;
	}
	

	@Override
	public double devision(double firstNumber, double secondNumber) {
		
		double result = firstNumber / secondNumber;
		
		return result;
	}
	
}
