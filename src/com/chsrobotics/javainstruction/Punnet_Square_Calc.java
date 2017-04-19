package com.chsrobotics.javainstruction;

public class Punnet_Square_Calc {
	
	static String				parent1Allele1 = "W"; //First allele in first parent
	static String				parent1Allele2 = "w"; //Second allele in second parent
	
	static String				parent2Allele1 = "w"; //First allele in second parent
	static String				parent2Allele2 = "w"; // Second allele in second parent
	
	public static boolean				p1A1dominant = true; // Is the 1st allele of parent 1 dominant?
	public static boolean				p1A2dominant = false; // Is the 2nd allele of parent 1 dominant?
	public static boolean				p2A1dominant = false; // Is the 1st allele of parent 2 dominant?
	public static boolean				p2A2dominant = false; // Is the 2nd allele of parent 2 dominant?
	
	public static void main(String[] args)
	{
		if(p1A1dominant || p2A1dominant)
		{
			System.out.println(parent1Allele1 + parent2Allele1 + " displays the dominant phenotype");
		}
		else System.out.println(parent1Allele1 + parent2Allele1 + " displays the reccessive phenotype");
		
		if(p1A1dominant || p2A2dominant)
		{
			System.out.println(parent1Allele1 + parent2Allele2 + " displays the dominant phenotype");
		}
		else System.out.println(parent1Allele1 + parent2Allele2 + " displays the reccessive phenotype");
		
		if(p1A2dominant || p2A1dominant)
		{
			System.out.println(parent1Allele2 + parent2Allele1 + " displays the dominant phenotype");
		}
		else System.out.println(parent1Allele2 + parent2Allele1 + " displays the reccessive phenotype");
		
		if(p1A2dominant || p2A2dominant)
		{
			System.out.println(parent1Allele2 + parent2Allele2 + " displays the dominant phenotype");
		}
		else System.out.println(parent1Allele2 + parent2Allele2 + " displays the reccessive phenotype");
		
		System.out.println("These are the four combinations");
		
	}

}
