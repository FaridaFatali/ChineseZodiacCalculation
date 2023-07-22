package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=XNhICHpYW98&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=14
 * @author Farida Fatali
 */

// Finding user's chinese zodiac by the year using if-else

public class ChineseZodiac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthyear: ");
        int year = scanner.nextInt();

        String zodiac = "";

        if (year % 12 == 0){
            zodiac = "Monkey";
        } else if (year % 12 == 1) {
            zodiac = "Rooster";
        } else if (year % 12 == 2) {
            zodiac = "Dog";
        } else if (year % 12 == 3) {
            zodiac = "Pig";
        } else if (year % 12 == 4) {
            zodiac = "Rat";
        } else if (year % 12 == 5) {
            zodiac = "Ox";
        } else if (year % 12 == 6) {
            zodiac = "Tiger";
        } else if (year % 12 == 7) {
            zodiac = "Rabbit";
        } else if (year % 12 == 8) {
            zodiac = "Dragon";
        } else if (year % 12 == 9) {
            zodiac = "Snake";
        } else if (year % 12 == 10) {
            zodiac = "Horse";
        } else if (year % 12 == 11) {
            zodiac = "Goat";
        }
        System.out.println("Your zodiac is: " + zodiac);

    }
}