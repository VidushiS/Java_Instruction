package com.chsrobotics.javainstruction;

	// The statements below calculate the quadratic formula
	
	// Quadratic Equation: a*x*x + b*x + c = 0
public class QuadFactorCalc {
		
	public static void main(String[] args){
		//Insert the values of the equation below
		double			a = 6;
		double			b = 13;
		double			c = 2;
		
		//This is the discriminant
		double			discriminant = (b*b)-(4*a*c);
		System.out.printf("The discriminant is equal to " + discriminant);
		
		
		//Tells what to do when there is a regular discriminant
		if(discriminant >= 0)
			{
				double 			d = (-b + Math.sqrt(discriminant))/ (2*a);
				double			e = (-b - Math.sqrt(discriminant))/ (2*a);
		
				System.out.printf("   x is equal to " + d);
				System.out.printf("   and x is equal to " + e);
		
			}
		
		//Tells what to do when there is a negative discriminant
		if(discriminant < 0)
			{
				discriminant = discriminant/-1;
				
				
				
				double 			f =  + Math.sqrt(discriminant);
				double 			g =  - Math.sqrt(discriminant);
				double			h = 2*a;
			
				
				
				
				System.out.printf("   x is equal to " + -b/h + " + " +f + "i/" + h);
				System.out.printf("   and x is equal to " + -b/h + " " + g + "i/" + h);
			}
		
		
		
		
		
		
		
		
		
	}
}
