package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"))) {
            // Palindrome
            Palindrome palindrome = new Palindrome();
            writer.write("Palindrome 121: " + palindrome.isPalindrome(121) + "\n");
            writer.write("Palindrome 123: " + palindrome.isPalindrome(123) + "\n");

            // Swapping
            Swapping swapping = new Swapping();
            int a = 5;
            int b = 10;
            swapping.swap(a, b);
            writer.write("Swapping 5 and 10: a = " + a + ", b = " + b + "\n");

            // String Palindrome
            StringPalindrome stringPalindrome = new StringPalindrome();
            writer.write("String Palindrome 'madam': " + stringPalindrome.isPalindrome("madam") + "\n");
            writer.write("String Palindrome 'hello': " + stringPalindrome.isPalindrome("hello") + "\n");

            // Perfect Number
            PerfectNumber perfectNumber = new PerfectNumber();
            writer.write("Perfect Number 28: " + perfectNumber.isPerfectNumber(28) + "\n");
            writer.write("Perfect Number 10: " + perfectNumber.isPerfectNumber(10) + "\n");

            // Fibonacci
            Fibonacci fibonacci = new Fibonacci();
            writer.write("Fibonacci 0: " + fibonacci.fibonacci(0) + "\n");
            writer.write("Fibonacci 1: " + fibonacci.fibonacci(1) + "\n");
            writer.write("Fibonacci 2: " + fibonacci.fibonacci(2) + "\n");
            writer.write("Fibonacci 3: " + fibonacci.fibonacci(3) + "\n");
            writer.write("Fibonacci 4: " + fibonacci.fibonacci(4) + "\n");

            // Armstrong
            Armstrong armstrong = new Armstrong();
            writer.write("Armstrong 153: " + armstrong.isArmstrong(153) + "\n");
            writer.write("Armstrong 123: " + armstrong.isArmstrong(123) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
