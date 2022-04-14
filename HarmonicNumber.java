package com.bridgelabz.corejava;
import java.util.Scanner;

/**
 * @author Prerna
 *
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth value Of Harmonic Number");
		N = sc.nextInt();
		sc.close();
	//check the if else conditions
		if (N > 0) {
			for (int count = 1; count <= N; count++) {
				System.out.print(1 + "/" + count + " " + "+" + " ");
			}

		} else {

			System.out.println("Invalid Input ");

		}
	}
}