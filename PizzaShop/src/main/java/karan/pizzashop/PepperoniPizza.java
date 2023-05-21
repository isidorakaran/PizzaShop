/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karan.pizzashop;

/**
 *
 * @author WinUSER
 */
public class PepperoniPizza implements Pizza{
    private Start start;
	

	public PepperoniPizza(Start start) {
		super();
		this.start = start;
	}

	public PepperoniPizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void name() {
		System.out.println("***PepperoniPizza ingredients (pizza sauce, mozzarella cheese and pepperoni)***");
		
	}

	
	
	
	public void menu() {
		System.out.println("");
		System.out.println("PIZZA MENU: ");
		System.out.println("Size options: ");
		System.out.println("1. Small Pizza - 6$");
		System.out.println("2. Medium Pizza - 9$");
		System.out.println("3. Large Pizza - 12$");
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
	
		return 6;
	}
	@Override
	public double getCostMedium() {
	
		return 9;
	}
	@Override
	public double getCostLarge() {
	
		return 12;
	}
}
