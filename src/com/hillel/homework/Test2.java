package com.hillel.homework;

public class Test2 {
    public static void main(String[] args) {

        int a = 2342;
        System.out.println("a=" + a);
        int b = -875;
        System.out.println("b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);


    }


}

