package com.methodreference;

public class MainClass {
	
	public static void main(String[] args) {
		
		I2 i = Demo::new;
		Demo d = i.no_Args_Constructor();
//		System.out.println(d);
		
		i3 j = Demo::new;
		Demo d1 = j.parameterized(0, null);
		System.out.println(d1);
		
		System.out.println();
		
		
	}

}
