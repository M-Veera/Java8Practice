package com.veera.practice;

import com.veera.practice.interfaces.Interface1;
import com.veera.practice.interfaces.Interface2;

public class DefaultInterfaceDiamondProblem implements Interface1, Interface2 {

	@Override
	public void check() {
		// TODO Auto-generated method stub
		Interface1.super.check();
	}

	public static void main(String[] args)
	{
		DefaultInterfaceDiamondProblem defaultInterfaceDiamondProblem = new DefaultInterfaceDiamondProblem();
		defaultInterfaceDiamondProblem.check();
		
	}

}
