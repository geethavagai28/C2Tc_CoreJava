package javaminiproject;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManagement 
{
	
	public static void main(String[] args)throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		int op ;
		System.out.println("If you want to modify anything in the table then enter Y->YES(or)N->NO");
		char choice=sc.next().charAt(0);
		while(choice!='N')
		{
			
		
			System.out.println("Enter the option for any DataModification 1->insert,2->update,3->show,4->Delete" );
			op=sc.nextInt();
			switch(op)
			{
			   case 1:
					System.out.println("Data to be inserted");
					DataModification.insertData();
					DataModification.showData();
					break;
			   case 2:
				   System.out.println("Data to be updated");
				   DataModification.updateData();
				   DataModification .showData();
				   break;
			   case 3:
				   System.out.println("Show the Data");
				   DataModification.showData();
				   break;
				   
			   case 4:
				   System.out.println("Row of the Data to be deleted");
				   DataModification .deleteData();
				   DataModification .showData();
				   break;
				  
				default:
					System.out.println("Enter the valid option!");
			}
			System.out.println("Do you want to continue this");
			choice=sc.next().charAt(0);
		}
		System.out.println("No-Modification");
		sc.close();
	}
}
			
		
				
		
	
	

		
	
					
		
		

	


