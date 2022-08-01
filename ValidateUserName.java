package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUserName {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String FirstName = sc.next();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$", FirstName);  
		System.out.println(b);
		
		System.out.println("Enter the Last Name");
		String LastName = sc.next();
		boolean b1 = Pattern.matches("^[A-Z]{1}[a-z]{2,20}$", LastName);  
		System.out.println(b1);

	}

}
