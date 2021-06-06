/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        myApp.silentCar();
    }

    public void silentCar() {
        System.out.print("Is the car silent when you turn the key? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            corrodedBattery();
        }
        else if (yn.equals("n")) {
            slickingNoise();
        } else {
            invalidInput();
            silentCar();
        }
    }

    public void corrodedBattery() {
        System.out.print("Are the battery terminals corroded? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            System.out.println("Clean terminals and try starting again.");
        } else if (yn.equals("n")) {
            System.out.println("Replace cables and try again.");
        } else {
            invalidInput();
            corrodedBattery();
        }
    }

    public void slickingNoise() {
        System.out.print("Does the car make a slicking noise? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            System.out.println("Replace the battery.");
        } else if (yn.equals("n")) {
            crankUp();
        } else {
            invalidInput();
            slickingNoise();
        }
    }

    public void crankUp() {
        System.out.print("Does the car crank up but fail to start? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            System.out.println("Check spark plug connections");
        } else if (yn.equals("n")) {
            startDie();
        } else {
            invalidInput();
            crankUp();
        }
    }

    public void startDie() {
        System.out.print("Does the engine start and then die? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            fuelInjection();
        } else if (yn.equals("n")) {
            System.out.println("This should not be possible.");
        } else {
            invalidInput();
            startDie();
        }
    }

    public void fuelInjection() {
        System.out.print("Does your car have a fuel injection? (y/n) ");
        String yn = input.nextLine();

        if (yn.equals("y")) {
            System.out.println("Get it in for service.");
        } else if (yn.equals("n")) {
            System.out.println("Check to ensure the choke is opening and closing.");
        } else {
            invalidInput();
            fuelInjection();
        }
    }

    public void invalidInput() {
        System.out.println("Invalid input. Please enter a valid input.");
    }
}
