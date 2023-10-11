package org.example;

import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pickupDate = getStringInput(scanner, "Enter the pickup date: ");
        int numberOfDaysOfRental = getIntInput(scanner, "How many days are you renting ?");
        boolean eTollTag = getBooleanInput(scanner, "Do you want the electronic toll tag ?");
        boolean GPS = getBooleanInput(scanner, "Do you want to use Gps ?");
        boolean RSA = getBooleanInput(scanner, "Do you need road side assistance ?");
        int currentAge = getIntInput(scanner, "What is your age ?");
        double total = calculateOptions(numberOfDaysOfRental, eTollTag,GPS,RSA,currentAge);
    }

    static String getStringInput(Scanner scanner, String msg) {
        System.out.println(msg);
        String input = scanner.next();
        scanner.nextLine();
        return input;
    }

    static int getIntInput(Scanner scanner, String msg) {
        System.out.println(msg);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    static boolean getBooleanInput(Scanner scanner, String msg) {
        System.out.println(msg);
        boolean input = scanner.hasNext();
        scanner.nextLine();
        return input;
    }

    static double calculateOptions(int numberOfRentalDays, boolean eTollTag, boolean GPS, boolean RSA, int currentAge) {
        if(eTollTag == true){
            System.out.printf("%5.2f\n ",3.95 * numberOfRentalDays);
        }else{
            System.out.println(0);
        }
        if(GPS == true){
            System.out.printf("%5.2f\n ",2.95 * numberOfRentalDays);
        }else{
            System.out.println(0);
        }
        if(RSA == true){
            System.out.printf("%5.2f\n ",3.95 * numberOfRentalDays);
        }else{
            System.out.println(0);
        }
        if(currentAge >= 25){
            System.out.println(0);
        }else{
            System.out.printf("%5.2f\n ",(29.99 * numberOfRentalDays) * 0.30);
        }
        return 0;
    }

}

