package app;

public class Main {

    static int a = 8;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int z = subtraction(a, b);
        System.out.println(z);
        int x = division(a, b);
        System.out.println(x);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int division(int a, int b) {
        return a / b;
    }
}
