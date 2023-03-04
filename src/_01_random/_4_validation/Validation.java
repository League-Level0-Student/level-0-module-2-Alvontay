//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(4);
		
		System.out.println(randomNumber);
		
		// prolly not right but it gives compliments somewhat ig idk
		
		if (randomNumber == 0) {
			System.out.println("good words");
		} else if (randomNumber == 1) {
			System.out.println("good words but 1");
		} else if (randomNumber == 2) {
			System.out.println("good words v2");
		} else if (randomNumber == 3) {
			System.out.println("good words v3");
		} 

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
