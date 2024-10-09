package com.veera.practice.interfaces;

@FunctionalInterface
public interface Caluclator {

	int add(int a, int b);
	default void defalutmethod()
	{
	System.out.println(" This is default method Example");	
	}
	
	static void staticMethod()
	{
		System.out.println("This is a static method");
	}
	
	static void staticMethod2()
	{
		System.out.println("This is a static method 2");
	}
}
