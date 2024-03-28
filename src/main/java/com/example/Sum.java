package com.example;
import java.util.Scanner;

/* Sum class should take input from user and return sum of those */

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
