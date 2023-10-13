package com.epam.OOP;

public class Animal {
	private static String color;
	private int numberOfPaws;
	private boolean hasFur;
	Animal() {}
	public Animal (String color, int numberOfPaws, boolean hasFur) {
		this.color=color;
		this.numberOfPaws=numberOfPaws;
		this.hasFur=hasFur;
	}
	public String getDescription() {
		
		if (hasFur&&numberOfPaws==1) {
			return "This animal is mostly "+color+". It has "+numberOfPaws+" paw and a fur.";
		} else if (!hasFur&&numberOfPaws==1) {
			return "This animal is mostly "+color+". It has "+numberOfPaws+" paw and no fur.";
		} else if (hasFur&&numberOfPaws>1) {
			return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur.";
		} else {
			return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur.";
		}
	}
}
