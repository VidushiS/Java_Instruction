package com.chsrobotics.javainstruction;
// This is an example class that solves a similar function to what the one you will be asked to solve is.
// Your project is to solve f(x)=(x+4)^2)/x-4, 0<=X<=10
public class Wednesday_Project {

	static float input = 0;
	public static float num(float given)
	{
		float output = (given + 4)*(given*3);
		return output;
	}
	public static float den(float given)
	{
		float output=(given-1);
		return output;
	}
	public static float f(float x)
	{
		float output = num(x)/den(x);
		return output;
	}
	public static void Method()
	{
		System.out.println("The Answer is: " + f(input));
	}
	public static void main(String args[])
	{
		for (int i=0; i <=15; i++)
		{
			Method();
			input++;
		}
	}
}
