package com.TNSIF.CoreJava.wrapper;

public class WrapperExample
{
	
	public static void main(String[] args)
	{
		
		int i=10;
		Integer a=new Integer(i);
		System.out.println(a);
		
		
		
		Integer c=i;
		System.out.println(c);
		
		//Auto Unboxing
		int b=c;
		System.out.println(b);
				
		int d=a.intValue();
		System.out.println(d);
				
				
				
				
				
				
				
				
	}
	
	
	
}
