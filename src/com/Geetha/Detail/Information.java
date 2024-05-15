package com.Geetha.Detail;
import java.util.Scanner;

public class Information 
{

	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		String Name;
		char initial;
		int mark1,mark2;
	  	float cgpa;
		System.out.println("Enter your Information");
		Name=s.next();
		initial=s.next().charAt(0);
		mark1=s.nextInt();
		mark2=s.nextInt();
		cgpa=s.nextFloat();
		System.out.println("Name is:"+Name);
		System.out.println("Initial is:"+initial);
		System.out.println("Mark1:"+mark1);
		System.out.println("Mark2:"+mark2);
		System.out.println("CPGA:"+cgpa);
		

	}

}
