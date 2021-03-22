//This console application calculates Palindrome numbers and return true if the number
// is palindrome vise versa if it's not
// What is palindrome number? It is the number that is equal to its reverse
// for example 1221 is palindrome
package com.karshiev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }
    public static boolean isPalindrome(int number){
        int digits = number;
        int reverse = 0;
        while (digits != 0){
            int lastDigit = digits % 10;
            reverse *= 10;
            reverse += lastDigit;
            digits/=10;
        }
        return number == reverse;
    }
}
