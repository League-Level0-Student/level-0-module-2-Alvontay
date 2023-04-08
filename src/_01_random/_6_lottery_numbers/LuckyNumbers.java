package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LuckyNumbers {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		String luckyNumbers = "";
		
		for (int i = 0; i < 6; i++) {
			luckyNumbers = luckyNumbers + " " + ran.nextInt(100);
		}

		JOptionPane.showMessageDialog(null, luckyNumbers);
		
	}
}
