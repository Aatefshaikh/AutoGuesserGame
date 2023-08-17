package com.project;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter firstname and lastname :");
		String firstname = scanner.nextLine();
		String lastname = scanner.nextLine();
		Email eml = new Email(firstname,lastname);
		System.out.println(eml.showInfo());
		
//		Email em2 = new Email("ganji","praveen");
//		System.out.println(em2.showInfo());
	
		
//		eml.setAlternateEmail("js@gmail.com");
//		System.out.println(eml.getAlternateEmail());
	}

}
