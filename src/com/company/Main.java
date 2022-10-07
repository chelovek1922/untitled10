package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 56, b = 7;
        System.out.println(a + b);
        sum(a, b);
        razn(a, b);
        proiz(a, b);
        chastnoe(a, b);
    }

    private static void sum(int a, int b) {
        System.out.print("a + b = ");
        System.out.println(a + b);
    }

    private static void razn(int a, int b) {
        System.out.print("a - b = ");
        System.out.println(a - b);
    }

    private static void proiz(int a, int b) {
        System.out.print("a * b = ");
        System.out.println(a * b);
    }

    private static void chastnoe(int a, int b) {
        System.out.print("a / b = ");
        System.out.println(a / b);
    }
}