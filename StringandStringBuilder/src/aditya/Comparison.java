package aditya;

public class Comparison {
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Salkar";
        String c = a;
//        System.out.println(c == a);

        //==
//        System.out.println(a == b);


        String name1 = new String("Aditya");
        String name2 = new String("Aditya");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));

    }
}
