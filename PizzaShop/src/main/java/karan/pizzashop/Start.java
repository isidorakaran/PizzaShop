/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package karan.pizzashop;

import java.util.Scanner;

/**
 *
 * @author WinUSER
 */
public class Start {

    private HawaiianPizza hawaiianPizza;
    private VeganPizza veganPizza;
    private PepperoniPizza pepperoniPizza;

    public Start() {

        HelpfulMethodes.input = new Scanner(System.in);
        hawaiianPizza = new HawaiianPizza(this);
        veganPizza = new VeganPizza(this);
        pepperoniPizza = new PepperoniPizza(this);

        mainMenu();
    }

    public void mainMenu() {
        System.out.println("");
        System.out.println("**MAIN MENU**");
        System.out.println("Select an option:");
        System.out.println("1. HAWAIIAN PIZZA");
        hawaiianPizza.name();
        System.out.println("2. VEGAN PIZZA");
        veganPizza.name();
        System.out.println("3. PEPPERONI PIZZA");
        veganPizza.name();
        System.out.println("4. REQUEST A BILL");

        selectingTheMainMenu();

    }

    private void selectingTheMainMenu() {

        switch (HelpfulMethodes.rangeNumber("Choose an option", 1, 4)) {
            case 1:

                hawaiianPizza.menu();
            case 2:
                veganPizza.menu();
            case 3:
                pepperoniPizza.menu();
            case 4:
                System.out.println("YOUR TOTAL IS: ");
                System.out.println(hawaiianPizza.bill + veganPizza.bill + pepperoniPizza.bill + " $");
                break;
        }

    }

    public HawaiianPizza getHawaiianPizza() {
        return hawaiianPizza;
    }

    public void setHawaiianPizza(HawaiianPizza hawaiianPizza) {
        this.hawaiianPizza = hawaiianPizza;
    }

    public VeganPizza getVeganPizza() {
        return veganPizza;
    }

    public void setVeganPizza(VeganPizza veganPizza) {
        this.veganPizza = veganPizza;
    }

    public PepperoniPizza getPepperoniPizza() {
        return pepperoniPizza;
    }

    public void setPepperoniPizza(PepperoniPizza pepperoniPizza) {
        this.pepperoniPizza = pepperoniPizza;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            HelpfulMethodes.DEV = true;
        } else {
            HelpfulMethodes.DEV = false;
        }
        new Start();

    }

}
