package com.veera.practice.functionalInterfaces;

@FunctionalInterface
public interface Caluclator {

	int add(int a, int b);
	default void defalutmethod()
	{
	System.out.println(" This is default method Example");	
	}
}
