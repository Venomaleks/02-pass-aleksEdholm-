package com.exemple.Teknikhogskolan._pass_aleks_Calculator;

import com.exemple.Teknikhogskolan._pass_aleks_Calculator_interface.AdvancedOperations;

public class AdvancedCalculatior extends BasicCalculator implements AdvancedOperations {

	@Override
	public double square(double number) {
		
		double reslut = number * number;
		
		return reslut;
	}
	
	
	@Override
	public double sinus(double number) {
		
		double reslut = Math.sin(number);
		
		//double reslut = (Math.sinh(number));
		
		return reslut;
	}
	

	@Override
	public double resiedToThePowerOf(double base, double exponent) {
		
		double reslut = Math.pow(base, exponent);
		
		return reslut;
	}
	

	@Override
	public double remainder(double dividend, double divisor) {
		
		double reslut = dividend % divisor;
		
		return reslut;
	}

	
	@Override
	public double inverse(double number) {
		
		double reslut = 1 / number;
		
		return reslut;
	}
	
}
