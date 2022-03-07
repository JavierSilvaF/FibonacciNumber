package com.valencia.FibonacciNumber;

/**
 * Program that calculates the 10th term of the fibonacci sequence.
 * @author Javier Silva
 * @author https://github.com/JavierSilva
 * @version 1.0
 * @since 1.0
 */

public class App {

    /**
     * Start the execution of the Fibonacci program and outputs the result
     * @param args argument of String type.
     */

    public static void main(String[] args) {
        int n = 10;
        double result = FibonacciCalculate(n);

        System.out.printf("The 10th term of the Fibonnaci Sequence is %2.2f", result);
    }//Main

    /** Method to find the nth term of the fibonacci sequence recursively.
     * @param n Number of times we're repeating the fibonacci sequence.
     * @return long value of the nth term of the fibonacci sequence
     */

    public static int FibonacciCalculate(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        } else
            return FibonacciCalculate(n - 1) + FibonacciCalculate(n - 2);
    }// Class
}