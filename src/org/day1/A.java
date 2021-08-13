package org.day1;

import java.util.ArrayList;
import java.util.List;

import org.java.A;

public  class A {
	
	//Access Specifiers 
	//same package and different package
	//Inheritance   
	//Abstraction
	//polymorphism
	//encapsulation
	//datatypes
	//scanner  - methods and return types
	//static and final
	//constructor
	//control statements
	//String -- methods -- return types
	//array
	//Collection  -- methods -- return types
	//Exception
	
	 public void tester1(int a) {
		 System.out.println(+a);
	 }
 public void tester1(int a,String name) {
	 System.out.println(+a);
     System.out.println(name);	 
 }
 public void tester1(int a,String name,double d) {
	 System.out.println(+d);
	 System.out.println(+a);
	 System.out.println(name);
 }
 
	public static void main(String[] args) {
		A a = new A ();
		a.tester1(1234);
		a.tester1(1234, "ezhil");
		a.tester1(1234, "ezhil", 12.34);
	}


}

	\