package com.aditya;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kunal";
        //block scope
        {
            //int a = 78; //*already initialised outside the block in  the same
             a = 100; //* reassign the origin ref variable to some other vlaue
            System.out.println(a);
             int c = 99;
             name = "Aditya";
            System.out.println(name);
         // *values initialised in this block , will remain in block
        }
   //     System.out.println(c);//cannot use outside the block
        System.out.println(a);
        System.out.println(name);


        //scoping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
//            int a = 10;
              a = 1000;
        }
        System.out.println(a);




    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
