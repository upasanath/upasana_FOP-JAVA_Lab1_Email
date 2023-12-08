package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Your First Name");
        String firstName=sc.next();
        
        System.out.println("Please enter Your Last Name");
        String lastName=sc.next();
        
        
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Legal");
        
        System.out.println("please choose Dept");
        int choice=sc.nextInt();
        
        String genEmail="";
        String genPassword="";
        switch(choice)
        {
        case 1:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "tech"); break;
        case 2:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "admin"); break;
        case 3:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "hr"); break;
        case 4:genEmail=empImpl.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "legal"); break;
        default:System.out.println("Please enter valid input");
           
        	
        }
        
      
        genPassword=empImpl.generatePassword();
        Employee e1=new Employee();
        e1.setFirstName(firstName);
        e1.setLastName(lastName);
        e1.setEmail(genEmail);
        e1.setPassword(genPassword);
        
        empImpl.showEmployeeDetails(e1);
	}
	

}
