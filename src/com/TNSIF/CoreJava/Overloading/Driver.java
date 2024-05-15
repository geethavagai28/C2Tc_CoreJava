package com.TNSIF.CoreJava.Overloading;
import java.util.Scanner; 
public class Driver 
{

	public static void main(String[] args) 
	{
			TicketBooking t=new TicketBooking();
			TicketBooking t1=new TicketBooking("MagicShow","Lunu",43);
			TicketBooking t2=new TicketBooking("PCB Worshop","Ahamed",3);
			TicketBooking t3=new TicketBooking("Electronics","Raja",2);
			TicketBooking t4=new TicketBooking("Foodies","Alice",1);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice:");
			int i=sc.nextInt();
			
			if(i==1)
			{
				t1.makePayment(500);
			}
			else if(i==2)
			{
				t2.makePayment("ASD-951",300);
			}
			else if(i==3)
			{
				t3.makePayment("Master","9874-4758-9856","Raja",200);
			}
			else
			{
				System.out.println("Invalid Choice");
			}
	}

}
