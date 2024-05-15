package com.TNSIF.practise;

public class Basics
{
	
	private int a;
	private int b;
	private int c;
	   
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println("value of c is:"+c);
	}
	public void add(float d,int e)
	{
		float f=d+e;
		System.out.println("value of float is"+f);
	}

}

class Derived extends Basics
{
		private String Name;
		
		public void method(String Name)
		{
			System.out.println("Name is:"+Name);
		}
}





