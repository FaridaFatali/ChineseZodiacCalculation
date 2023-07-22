package org.example;

import java.util.Scanner;

// Finding user's chinese zodiac by the year using switch-case

public class ChineseZodiac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthyear: ");
        int year = scanner.nextInt();

        int result = year % 12;
        String message = "Your zodiac is: ";
        String zodiac = "";

//        switch (result){
//            case 0:
//                zodiac = "Monkey";
//                break;
//            case 1:
//                zodiac = "Rooster";
//                break;
//            case 2:
//                zodiac = "Dog";
//                break;
//            case 3:
//                zodiac = "Pig";
//                break;
//            case 4:
//                zodiac = "Rat";
//                break;
//            case 5:
//                zodiac = "Ox";
//                break;
//            case 6:
//                zodiac = "Tiger";
//                break;
//            case 7:
//                zodiac = "Rabbit";
//                break;
//            case 8:
//                zodiac = "Dragon";
//                break;
//            case 9:
//                zodiac = "Snake";
//                break;
//            case 10:
//                zodiac = "Horse";
//                break;
//            case 11:
//                zodiac = "Goat";
//                break;
//        }
//        System.out.println(message + zodiac);

        switch (result){
            case 0 -> zodiac = "Monkey";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "Dog";
            case 3 -> zodiac = "Pig";
            case 4 -> zodiac = "Rat";
            case 5 -> zodiac = "Ox";
            case 6 -> zodiac = "Tiger";
            case 7 -> zodiac = "Rabbit";
            case 8 -> zodiac = "Dragon";
            case 9 -> zodiac = "Snake";
            case 10 -> zodiac = "Horse";
            case 11 -> zodiac = "Goat";
        }
        System.out.println(message + zodiac);
    }
}
