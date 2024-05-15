package com.TNSIF.Assignment;

public class BankClass
{
	
	static int total_accounts=15;
	static int  getTotalAccounts()
	{
		return total_accounts;
	}
	
	public static void main(String[] args)
	{
		BankClass b=new BankClass();
		b.total_accounts=10;
		b.total_accounts=25;
		int a=b.getTotalAccounts();
		
		BankClass b1=new BankClass();
		b1.total_accounts=20;
		int c=b1.getTotalAccounts();
		
		
		System.out.println(total_accounts);
		System.out.println(c);
		
	}
	
	
	
}
