package javaminiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class DataModification 
{
	private static final  String url="jdbc:mysql://localhost:3306/jdbc";
    private static final String username="root";
	private static final String password="password@SQL28";

	public static void showData()throws SQLException
	{
		

		Connection con= DriverManager.getConnection(url, username, password);
		
		Statement st= con.createStatement();
		
		
		String query="select *from employee";
		ResultSet rs=st.executeQuery(query);
		//rs.next();
		while(rs.next())
		{
			System.out.println("id:"+rs.getInt(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Salary:"+rs.getInt(3));
			System.out.println("Location:"+rs.getString(4));
			System.out.println("Desgination:"+rs.getString(5));
		}
		con.close();
		

	}
	public static void insertData()throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id to insert:");
		int empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of employee to insert:");
		String empname=sc.next();
		System.out.println("Enter the salary of employee to insert:");
		int empsalaray=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the location of employee to insert:");
		String emplocation=sc.next();
		System.out.println("Enter the Desgination of the employee to insert:");
		String empdesgination=sc.next();
		String query="insert into employee values("+empid+",'"+empname+"',"+empsalaray+",'"+emplocation+"','"+empdesgination+"');";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		System.out.println("Number of rows afftected in employee:"+rows);
		
	
		
		con.close();
	}
	
	public static void deleteData()throws SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the employee id to delete:");
		int del=s.nextInt();
		String query="delete from employee where id="+del;
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);
		System.out.println("Number of rows to be affeced:"+rows);
		con.close();
	}
	
	public static void updateData()throws SQLException
	{
		int id,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id to update");
		id=sc.nextInt();
		System.out.println("updated column is:"+id);
		Connection con=DriverManager.getConnection(url, username,password);
		Statement st=con.createStatement();
		while(id!=0)
		{
			System.out.println("updation in all columns then enter 1 or 0");
			value=sc.nextInt();
			if(value==1)
			{
				System.out.println("Enter the employee name for updation");
				String name=sc.next();
				System.out.println("Enter the employee salary for updation");
				int salary=sc.nextInt();
				System.out.println("Enter the location of the employee");
				String loc=sc.next();
				System.out.println("Enter the Desgination of employee");
				String desgination=sc.next();
				String query="update employee set salary='"+salary+"'where id="+id;
				String que="update employee set desgination='"+desgination+"'where id="+id;
				String quer="update employee set ename='"+name+"'where id="+id;
				String qu="update employee set location='"+loc+"'where id="+id;
				
				
			}
			else
			{
			
				String column;
				System.out.println("Which column to be updated");
				column=sc.next();
				
				switch(column)
				{
				case "ename":
					System.out.println("Enter the employee name for updation");
					String name=sc.next();
					String quer="update employee set ename='"+name+"'where id="+id;
					int r=st.executeUpdate(quer);
				     break;
					
				case "salary":
					System.out.println("Enter the employee salary for updation");
					int salary=sc.nextInt();
					String query="update employee set salary='"+salary+"'where id="+id;
					int rows=st.executeUpdate(query);
					break;
					
				case "location":
					System.out.println("Enter the employee location for updation");
					String loc=sc.next();
					String qu="update employee set location='"+loc+"'where id="+id;
					int row=st.executeUpdate(qu);
					break;
					
				case "desgination":
					System.out.println("Enter the employee desgination for updation");
					String desgination=sc.next();
					String que="update employee set Desgination='"+desgination+"'where id="+id;
					int rowss=st.executeUpdate(que);
					break;
					
					
				}
			}
			break;
		}
	}
}
		
			

			
		
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
