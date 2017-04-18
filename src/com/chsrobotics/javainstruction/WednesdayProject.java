package com.chsrobotics.javainstruction;

public class WednesdayProject {
		
		
	public static void Method()
	{
		
		for(int number = 0; number <3; number++)
		{
			 float x = ((number + 4) * (number + 4));
			 float y = (number - 3);
			 float z = x/y;
			 
			 System.out.println("The answer is: " + z);
			 
			
		}
		
		for(int number = 4; number <=10; number++)
		{
			float x = ((number + 4) * (number + 4));
			float y = (number - 3);
			float z = x/y;
			 
			 System.out.println("The answer is: " + z);
			 
			
		}
		
		
	}
	public static void main(String[] args)
	{
		Method();
		
	}
}
