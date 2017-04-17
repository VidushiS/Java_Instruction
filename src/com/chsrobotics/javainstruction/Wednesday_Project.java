package com.chsrobotics.javainstruction;

public class Wednesday_Project {

	static float input = 5;
public static float equation(float given)
{
	float output = (given * 5)/25;
	return output;
}
public static void Method()
{
	System.out.println("The Answer is: " + equation(input));
}
public static void main(String args[])
{
	Method();
}
}
