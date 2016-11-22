package com.demo;

public class FunctImpl implements Funct {

	@Override
	public void fun() {
		System.out.println("fun() called.");

	}

	public static void main(String[] args) {
		Funct.fin();
		FunctImpl fn = new FunctImpl();
		//Funct func -> 
	}

}
