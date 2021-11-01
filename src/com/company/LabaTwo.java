package com.company;

import java.util.Scanner;

public class LabaTwo {
    public static void main(String[] args) {
        while(true) {
            System.out.print("Выберете номер задания: ");
            Scanner sc = new Scanner(System.in);
            String numbfunc = sc.nextLine();
            switch (numbfunc) {
                case "1" -> task_1();
                case "2" -> task_2();
                case "3" -> task_3();
                case "4" -> task_4();
                case "5" -> task_5();
                case "6" -> task_6();
                case "7" -> task_7();
                case "8" -> task_8();
                default -> {
                    System.out.println("Такого задания нет");
                    break;
                }
            }
        }
    }
    static void task_1(){
        int a = 15;
        int b = 4;
        float c = (float)a / b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
    static void task_2(){
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + f);
        b = (byte)b;
        System.out.println(b);
    }
    static void task_3(){
        short number = 9;
        char zero = '0';
        int nine = (zero-'0') + number;
        System.out.println(nine);
    }
    static void task_4(){
        double d = (short) 2.50256e2d;
        char c = 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
    static void task_5(){
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte)110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
    static void task_6(){
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
    static void task_7(){
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;
        System.out.println(d);
    }
    static void task_8() {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + (float) (b / c) / e;
        System.out.println(d);
    }
}
