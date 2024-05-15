package com.TNSIF.CoreJava.Overloading;

public class TicketBooking
{
	
	
	
	private String Stage_Event;
	private String Customer;
	private int No_of_Seats;
	
	
	public String getStage_Event()
	{
		return Stage_Event;
	}
	public void setStage_Event(String stage_Event)
	{
		Stage_Event = stage_Event;
	}
	public String getCustomer()
	{
		return Customer;
	}
	public void setCustomer(String customer)
	{
		Customer = customer;
	}
	public int getNo_of_Seats()
	{
		return No_of_Seats;
	}
	public void setNo_of_Seats(int no_of_Seats)
	{
		No_of_Seats = no_of_Seats;
	}
	
	TicketBooking()
	{
		System.out.println("TicketBooking Event");
	}
	
	public TicketBooking(String stage_Event, String customer, int no_of_Seats)
	{

		Stage_Event = stage_Event;
		Customer = customer;
		No_of_Seats = no_of_Seats;
	}
	
	public void makePayment(double amount)
	{
		System.out.println("Stage Event:"+Stage_Event);
		System.out.println("Customer:"+Customer);
		System.out.println("Number of Seats:"+No_of_Seats);
		System.out.print("Amount "+amount );
		System.out.println("paid in cash");
		
	}
	
	public void makePayment(String WalletNumber,double amount)
	{
		System.out.println("Stage Event:"+Stage_Event);
		System.out.println("Customer:"+Customer);
		System.out.println("Number of Seats:"+No_of_Seats);
		System.out.print("Amount "+amount );
		System.out.println("paid using walletNumber"+WalletNumber);

		
		
	}
	public void makePayment(String creditcard,String ccv,String name,double amount)
	{
		System.out.println("Stage Event:"+Stage_Event);
		System.out.println("Customer:"+Customer);
		System.out.println("Number of Seats:"+No_of_Seats);
		System.out.println("Holder name:"+name);
		System.out.print("Amount "+amount );
		System.out.print("paid using "+creditcard);
		System.out.println("card");
		System.out.println("CCV:"+ccv);

		
	}
	
	
}
