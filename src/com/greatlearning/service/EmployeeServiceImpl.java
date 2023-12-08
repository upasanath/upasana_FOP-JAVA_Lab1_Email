package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fname, String lname, String deptName) {
		
		return fname+lname+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;
		String myPass="";
		
		Random random=new Random();
		for(int i=1;i<=8;i++) {
			
			myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
			}
		
		return myPass;
		}
		
	

	@Override
	public void showEmployeeDetails(Employee e) {
		
		System.out.println("Employee First Name is :"+ e.getFirstName());
		System.out.println("Employee Last Name is :"+ e.getLastName());
		System.out.println("Employee Email is :"+ e.getEmail());
		System.out.println("Employee Password is :"+ e.getPassword());
	}

}
