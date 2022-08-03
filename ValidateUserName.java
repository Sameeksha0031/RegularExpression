package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUserName {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the First Name");
		String FirstName = sc.next();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$", FirstName);  
		System.out.println(b);
		
		System.out.println("Enter the Last Name");
		String LastName = sc.next();
		boolean b1 = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$", LastName);  
		System.out.println(b1);
		
		System.out.println("Enter the email");
		String email = sc.next();
		boolean b2 = Pattern.matches("^[a-z](.+)@(\\S+)$", email);  
		System.out.println(b2);
		
		System.out.println("Enter the PhoneNumber");
		String phoneno = sc.nextLine();
		boolean b3 = Pattern.matches("^([0-9]{2})? ?[0-9]{1}[0-9]{9}$", phoneno);
		System.out.println(b3);*/
		
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		boolean b4 = Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*?])[A-Za-z\\d!@#$%^&*?]{8,12}$", password);
		System.out.println(b4);

	}
}
