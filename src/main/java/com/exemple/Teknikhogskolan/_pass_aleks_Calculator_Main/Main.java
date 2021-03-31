package com.exemple.Teknikhogskolan._pass_aleks_Calculator_Main;

import com.exemple.Teknikhogskolan._pass_aleks_Calculator.AdvancedCalculatior;
import com.exemple.Teknikhogskolan._pass_aleks_Calculator.BasicCalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvancedCalculatior aCC = new AdvancedCalculatior();
		
		BasicCalculator bCC = new BasicCalculator();
		
		/* */
		
		System.out.println("addision");
		System.out.println(bCC.addision(3, 7));
		
		System.out.println("subbtract");
		System.out.println(bCC.subbtract(13, 6));
		
		System.out.println("devison");
		System.out.println(bCC.devision(21, 3));
		
		System.out.println("multyply");
		System.out.println(bCC.multy(2, 3));
		
		System.out.println("remainder what the rest procut is ");
		System.out.println(aCC.remainder(77, 10));
		
		System.out.println("Sin of this number (in radians) ");
		System.out.println(aCC.sinus(4));
		
		
		System.out.println("square");
		System.out.println(aCC.square(-6));
		
		
		System.out.println("inverse");
		System.out.println(aCC.inverse(1));
		
		System.out.println("reside to the power of that XD");
		System.out.println(aCC.resiedToThePowerOf(3, 2));
		
		
		/* */
	}

}
