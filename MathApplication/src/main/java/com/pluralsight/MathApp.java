package com.pluralsight;

public class MathApp {
    public static void main(String[] args){
        double bobSalary;
        bobSalary = 250.00;
        double garySalary;
        garySalary = 300.00;
        double highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is... " + highestSalary);
    }
    public static void car(String[] args){
        int carPrice = 75;
        int truckPrice = 100;
        int cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest price is ..." + cheapestPrice);
    }
}
