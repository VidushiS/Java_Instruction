package com.chsrobotics.javainstruction;

public class Var {

	public static double top(double x)
	{
		return ((Math.pow((x + 4), 2)) / (x - 3));
	}
	public static void main(String[] args) {
		double v = 0;
		double newV;
		
		while (v <= 10)
		{ 
			newV = top(v);
			System.out.println("At " + v + " f(x) = " + newV);
			v++;
		}
	}

}
