package com.piash;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping values are.. " +a+" " +b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping values are.. " +a+" " +b);

    }
}
