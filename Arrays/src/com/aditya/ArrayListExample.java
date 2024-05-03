package com.aditya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(674);
//        list.add(678);
//        list.add(67);
//        list.add(68);
//        list.add(65);
//        list.add(66);
//        list.add(61);
//        list.add(62);
//        list.add(63);
//        list.add(64);
//
//
//
//        System.out.println(list.contains(64));
//        System.out.println(list.contains(50));
//
//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());

        }

        // get item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here

        }

//        System.out.println(list);



    }
}
