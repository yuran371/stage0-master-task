package com.epam.OOP;

public class Dog extends Animal {
	private static String color;
	private static int numberOfPaws;
	private static boolean hasFur;

	public Dog() {
		super(color="brown", numberOfPaws=4, hasFur=true);
	}
	public String getDescription() {
		return super.getDescription();
		
	}

}
