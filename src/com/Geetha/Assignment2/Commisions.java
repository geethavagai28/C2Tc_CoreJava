package com.Geetha.Assignment2;
import java.util.Scanner;

public class Commisions 
{
	Scanner obj=new Scanner(System.in);
	private String Name;
	private String Address;
	private long phone;
	private long Sales_amount;
	
	
	
	void methodEmployee()
	{
		System.out.println("Enter the name:");
		Name=obj.nextLine();
		System.out.println("Enter the address:");
		Address=obj.nextLine();
		System.out.println("Enter your PhoneNumber:");
		phone=obj.nextInt();
		System.out.println("Enter the SalesAmount:");
		Sales_amount=obj.nextInt();
		
	}
	void methodCommission()
	{
		if(Sales_amount>=100000)
		{
			System.out.println("Commission=10%");
		}
		else
		{
			if(Sales_amount<=50000&&Sales_amount<100000)
			{
				System.out.println("Commission=5%");
			}
			else
			{
				if(Sales_amount<=30000&&Sales_amount<50000)
				{
					System.out.println("Commission=3%");
					
				}
				else
				{
					if(Sales_amount<30000)
					{
						System.out.println("No Commission");
					}
				}
			}
		}
	}

}
