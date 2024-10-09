package com.veera.practice;

import com.veera.practice.functionalInterfaces.Caluclator ;
import com.veera.practice.functionalInterfaces.Caluclator2;


public class DefaultmethodExample implements Caluclator {
	
	public static void main(String[] args)
	{
		Caluclator CalculatorImpl = new DefaultmethodExample();
		Caluclator c = (a,b) -> 
		{
			if(a<b) {
				throw new RuntimeException("Business error");
			}
			else
				return a+b;
		};
		
		System.out.println(c.add(300, 30));
		
		CalculatorImpl.defalutmethod();
		
		(new Caluclator2() {}).defalutmethod();
		
		
		
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void defalutmethod()
	{
	System.out.println(" This is CalculatorImpl method Example");	
	}
	
	

}
