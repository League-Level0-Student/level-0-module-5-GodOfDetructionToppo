package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Pick a number");
		int num = Integer.parseInt(input);
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println( i +" is not prime");
				
			}
			else
				System.out.println("i is " + i);
				System.out.println( i + " is prime");
		}

	}

}
  