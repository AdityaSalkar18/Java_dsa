package com.aditya;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//      fun(2,3,4,5,56,87,23,45,65);
     // fun();

      multiple(2, 3, "aditya","snket" ,"shlok");

       // demo(2,3,4);
        demo("aditya","sanket","shlok");
        //demo(); can not be empty in overloding

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }

    static void multiple(int a, int b, String ...s){
//        System.out.println(Arrays.toString(s));
    }


//   static void fun(int ...v){
//       System.out.println(Arrays.toString(v));
//   }
}
