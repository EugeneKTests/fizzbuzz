package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println();
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            } else if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
        }
    }
}
