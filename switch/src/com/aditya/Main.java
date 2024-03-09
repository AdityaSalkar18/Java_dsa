package com.aditya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String fruit = input.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

//        int day = input.nextInt();
//        switch(day) {
//            case 1 -> System.out.println("Monaday");
//            case 2 -> System.out.println("Thuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

//        int day = input.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monaday");
//                break;
//            case 2:
//                System.out.println("Thuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

//        int day = input.nextInt();
//        if (day == 1) {
//            System.out.println("Monaday");
//        } else if (day == 2) {
//            System.out.println("Thuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        }

//        int day = input.nextInt();
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//
//        }

        int day = input.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}