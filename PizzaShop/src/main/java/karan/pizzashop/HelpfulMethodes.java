/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.pizzashop;

import java.util.Scanner;

/**
 *
 * @author WinUSER
 */
public class HelpfulMethodes {
    public static Scanner input;
	public static boolean DEV;

	public static int rangeNumber(String message, int min, int max) {
		int i;
		while (true) {
			try {
				System.out.println(message);
				i = Integer.parseInt(input.nextLine());
				if (i < min || i > max) {
					System.out.println("Number has to be between " + min + " i " + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("You didn't input a number.");

			}

		}

	}
}
