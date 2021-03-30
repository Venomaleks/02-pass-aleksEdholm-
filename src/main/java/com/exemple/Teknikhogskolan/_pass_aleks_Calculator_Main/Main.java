package com.exemple.Teknikhogskolan._pass_aleks_Calculator_Main;

import com.teknikhogskolan.calculator_aleks.advanceCalculatorClass;
import com.teknikhogskolan.calculator_aleks.simpleCalculatorClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		advanceCalculatorClass aCC = new advanceCalculatorClass();
		
		simpleCalculatorClass sCC = new simpleCalculatorClass();
		
		System.out.println("addision");
		System.out.println(sCC.addision(3, 7));
		
		System.out.println("subbtract");
		System.out.println(sCC.subbtract(13, 6));
		
		System.out.println("devison");
		System.out.println(sCC.devision(21, 3));
		
		System.out.println("multyply");
		System.out.println(sCC.multy(2, 3));
		
		System.out.println("remainder what the rest procut is ");
		System.out.println(aCC.remainder(77, 10));
		
		System.out.println("sin of this number");
		System.out.println(aCC.sinus(21));
		
		System.out.println("square");
		System.out.println(aCC.square(3));
		
		System.out.println("inverse");
		System.out.println(aCC.inverse(107));
		
		System.out.println("reside to the power of that XD");
		System.out.println(aCC.resiedToThePowerOf(7, 35));
	}

}
