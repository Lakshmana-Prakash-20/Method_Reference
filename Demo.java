package com.methodreference;

public class Demo {
	int id;
	String name;
	
	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("No args constructor");
	}
	
	Demo(int id, String name){
		System.out.println("Parameterized constructor");
		this.id=id;
		this.name=name;
		
	}

}
