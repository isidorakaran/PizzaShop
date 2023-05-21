/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.pizzashop;

/**
 *
 * @author WinUSER
 */
public class HawaiianPizza implements Pizza{
    private Start start;
	

	public HawaiianPizza(Start start) {
		super();
		this.start = start;
	}

	public HawaiianPizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void name() {
		System.out.println("**HawaiianPizza ingredients (pizza sauce, cheese, cooked ham, and pineapple)***");
		
	}

	
	
	
	public void menu() {
		System.out.println("");
		System.out.println("PIZZA MENU: ");
		System.out.println("Size options: ");
		System.out.println("1. Small Pizza - 5$");
		System.out.println("2. Large Pizza - 10$");
		System.out.println("3. Medium Pizza - 15$");
		System.out.println("4. Return to the main menu");
		menuSelection();
	}
	double bill=0;
	public void menuSelection() {
	
			switch (HelpfulMethodes.rangeNumber("Choose an option: ", 1, 4)) {
			case 1:
				bill+=getCostSmall();
			
				menuSelection();
				break;
			case 2:
				bill+=getCostMedium();
			
				menu();
				break;
			case 3:
				bill+=getCostLarge();
			
				menuSelection();
				break;
			
			case 4:
				start.mainMenu();
			}
		
		
	}

	@Override
	public double getCostSmall() {
	
		return 5;
	}
	@Override
	public double getCostMedium() {
	
		return 10;
	}
	@Override
	public double getCostLarge() {
	
		return 15;
	}
}
