package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUserName {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		boolean b3 = Pattern.matches("^[A-Z]{1,}[A-Za-z]{2,20}$", userName);  
		System.out.println(b3);

	}

}
