package com.calculator;

public class App {

	public static void main(String[] args) {
		System.out.println("===========================================================");
		System.out.println("|");
		System.out.println("|");
		if(args.length == 0) {
			System.out.println(" Welcome to maven project");
		}else {
			System.out.println("Maven properties are : "+ args[0]);
		}
		System.out.println("|");
		System.out.println("|");
		System.out.println("===========================================================");
		
	}

}
