package com.junitproject.test;

public class BasicOperations {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int a = 6;
		int b = 2;
		
		System.out.println(addition(a, b));
		System.out.println(subtraction(a,b));
		System.out.println(multiplication(a,b));
		System.out.println(division(a,b));
		
		

	}
	
	public static int addition(int a, int b){
		int c = a + b;
		return c;
	}
	
	public static int subtraction(int a, int b){
		int c = a - b;
		return c;
	}
	public static int multiplication(int a, int b){
		int c = a * b;
		return c;
	}
	
	public  static int division(int a, int b){
		int c = a/b ;
		return c;
	}
}
