package com.bridgelabz.corejava;
import java.util.Scanner;
/**
 * @author Prerna
 *
 */
public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u', check;

		char A = 'A', E = 'E', I = 'I', O = 'O', U = 'U';

		System.out.println("Enter any alphabet ");

		check = sc.next().charAt(0);
		if (check == a || check == A)
			System.out.println("Vowel");

		else if (check == e || check == E)
			System.out.println("Vowel");

		else if (check == i || check == I)
			System.out.println("Vowel");

		else if (check == o || check == O)
			System.out.println("Vowel");

		else if (check == u || check == U)
			System.out.println("Vowel");

		else
			System.out.println("Consonent");

		sc.close();
  }
}