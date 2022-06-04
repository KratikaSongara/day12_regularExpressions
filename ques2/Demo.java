package com.ques2;
import java.util.regex.*;
import java.util.Scanner;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		Boolean name1 = Pattern.matches("[a-zA-z]{3,8}",name);
		Boolean mobile = Pattern.matches("[6789]{1}[0-9]{9}",mobileNum);
		Boolean aadhar = Pattern.matches("[0-9]{12}", aadharCard);
		if(name1==true && mobile==true && aadhar==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter mobile");
		String mobile = sc.next();
		
		System.out.println("Enter aadhar number");
		String aadhar = sc.next();
		
		Demo d1 = new Demo();
		boolean value=d1.validate(name, mobile, aadhar);
		
		if(value==true)
		{
			Citizen citizen = new Citizen();
			citizen.setName(name);
			citizen.setAadharNumber(aadhar);
			citizen.setMobileNumber(mobile);
			
			System.out.println("Name : "+citizen.getName());
			System.out.println("Aadhar Number : "+citizen.getAadharNumber());
			System.out.println("Mobile Number : "+citizen.getMobileNumber());
		}
		
		else
		{
			System.out.println("Error : Enter valid details");
		}
	}

}
