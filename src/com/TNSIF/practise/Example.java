package com.TNSIF.practise;

public class Example
{
	private int a;
	private int b;
	private int c;
	void method(int a,int b)
	{
	c=a+b;
	System.out.println("c="+c);
	}
	
public static void main(String[] args)
{
		System.out.println("Hello world!");
		Example e=new Example();
		e.method(10,20);
		
}


}