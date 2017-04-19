package com.chsrobotics.javainstruction;

public class Punnet_Square_Calc {
	
	static String				parent1Allele1 = "B"; //First allele in first parent
	static String				parent1Allele2 = "b"; //Second allele in second parent
	
	static String				parent2Allele1 = "b"; //First allele in second parent
	static String				parent2Allele2 = "b"; // Second allele in second parent
	
	public static void main(String[] args)
	{
		System.out.println(parent1Allele1 + parent2Allele1);
		System.out.println(parent1Allele1 + parent2Allele2);
		System.out.println(parent1Allele2 + parent2Allele1);
		System.out.println(parent1Allele2 + parent2Allele2);
		System.out.println("These are the four combinations");
		
	}

}
