package com.epam.OOP;

public class Bird extends Animal {
	private static String color;
	private static int numberOfPaws;
	private static boolean hasFur;
	
	public Bird () {
		super(color="blue", numberOfPaws=2, hasFur=false);
	}
	public String getDescription() {
		return ("This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur. Moreover, it has 2 wings and can fly.");		
	}
}
