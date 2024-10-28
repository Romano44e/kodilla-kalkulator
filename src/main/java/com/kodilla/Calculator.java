package com.kodilla;

import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;

    Scanner scanner = new Scanner(System.in);

    public double adding() {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double c = a + b;
        System.out.println("Wynik dodawania to: " + c);
        return c;
    }

    public double subtracting() {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double d = a - b;
        System.out.println("Wynik odejmowania to : " + d);
        return d;
    }
}
