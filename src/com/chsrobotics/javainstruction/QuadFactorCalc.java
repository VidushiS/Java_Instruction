package com.chsrobotics.javainstruction;

	// The statements below calculate the quadratic formula

public class QuadFactorCalc {
		
	public static void main(String[] args){
		//Insert the values of the equation below
		double			a = 1;
		double			b = 11;
		double			c = 30;
		
		//This calculates everything for you!
		double 			d = (-b + Math.sqrt((b*b)-(4*a*c)))/ (2*a);
		double			e = (-b - Math.sqrt((b*b)-(4*a*c)))/ (2*a);
		
		//These are the discriminants
		double			f = Math.sqrt((b*b)-(4*a*c));
		double			g = Math.sqrt((b*b)-(4*a*c));
		
		System.out.printf("D is equal to " + d);
		System.out.printf("   E is equal to " + e);
		System.out.printf("   The discriminant is equal to " + f);
		
		
		
	}
}
