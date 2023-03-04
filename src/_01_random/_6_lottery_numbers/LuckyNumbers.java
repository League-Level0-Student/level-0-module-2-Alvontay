package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LuckyNumbers {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int luckyNumbers = ran.nextInt();
		JOptionPane.showMessageDialog(null, luckyNumbers);
		//uhh
	}
}
