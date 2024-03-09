package com.aditya;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID){
//            case 1:
//                System.out.println("Aditya Salkar");
//                break;
//            case 2:
//                System.out.println("Sanket Patil");
//                break;
//            case 3:
//                System.out.println("Emp number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department enter");
//
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//        }

        switch (empID) {
            case 1 -> System.out.println("Aditya Salkar");
            case 2 -> System.out.println("Sanket Patil");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department enter");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }

}
