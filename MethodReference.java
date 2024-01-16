package com.methodreference;


public class MethodReference {
	
	public static void m2() {
		System.out.println("M2 method");
	}
	
	public static void main(String[] args) {

		
		I1 i =(String s)->{System.out.println(s);};
		

		
		i.m1("hello")
		;
		
		
	
	}

}
