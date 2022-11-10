package com.application.fullstackdemo;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		Student std = new Student("Girish","Java","Hyd","9988998899");

		std.displayStdDetails();
		
		std.setStdName("Keerti");
		
		//std.displayStdDetails();
		
		String city = std.getStdCity();
		System.out.println(city);
		
		String Name = std.getStdName();
		System.out.println(Name);

		std.displayStdDetails();

		
	}

}
