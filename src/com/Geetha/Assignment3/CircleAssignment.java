package com.Geetha.Assignment3;
import java.util.Scanner;
public class CircleAssignment
{
	public int Radius;
	public double Area;
	public String Color;
	public void getInputs()
	{   
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		Radius=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter the Colour of the circle:");
		Color=obj.next();
		obj.close();
		
	}
    public void calcArea() 
	{
		Area=3.14*Radius*Radius;
		System.out.println("Area of the circle="+Area);
	}
	

}


