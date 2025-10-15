package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Jenkins Test Run: Welcome to the Fun Loop Program! 🚀");

        Random random = new Random();
        int sum = 0;

        // Generate 5 random numbers and print them
        for (int i = 1; i <= 5; i++) {
            int number = random.nextInt(100); // random number between 0-99
            sum += number;
            System.out.printf("Round %d: Generated number = %d%n", i, number);
        }

        // Print sum and average
        double average = sum / 5.0;
        System.out.println("--------------------------------------------------");
        System.out.printf("Total sum of numbers: %d%n", sum);
        System.out.printf("Average of numbers: %.2f%n", average);

        // Fun ending message
        if (average > 50) {
            System.out.println("🎉 High score! Jenkins is happy! 🎉");
        } else {
            System.out.println("😎 Not bad! Keep testing Jenkins builds! 😎");
        }
    }
}
