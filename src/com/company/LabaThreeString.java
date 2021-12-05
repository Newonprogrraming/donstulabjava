package com.company;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class LabaThreeString {
    public static void main(String[] args) {
        //task_1();
        task_3();
    }
    static void task_1(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] fulltext = new String[n];
        String swap;
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСтрока №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }

        //Шейкерная сортировка
        if (fulltext == null) {
            return;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            for (int i = right; i > left; --i) {
                if (fulltext[i - 1].length() > fulltext[i].length()) {
                    swap = fulltext[i - 1];
                    fulltext[i - 1] = fulltext[i];
                    fulltext[i] = swap;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (fulltext[i].length() > fulltext[i + 1].length()) {
                    swap = fulltext[i];
                    fulltext[i] = fulltext[i+1];
                    fulltext[i+1] = swap;
                }
            }
            --right;
        }
        for (int i = 0; i < n; i++ ){
            System.out.println(fulltext[i] + ": " + fulltext[i].length());
        }
    }
    static void task_2(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] fulltext = new String[n];
        String swap;
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСтрока №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }

        //Сортировка расчёской
        double factor = 1.247; // Фактор уменьшения
        int step = n-1;

        while (step >= 1) {
            for (int i = 0; i + step < n; ++i) {
                if (fulltext[i].length() >= fulltext[i + 1].length() ) {
                    swap = fulltext[i+1];
                    fulltext[i+1] = fulltext[i];
                    fulltext[i] = swap;
                }
            }
            step /= factor;
        }
        for (int i = 0; i < n; i++ ){
            System.out.println(fulltext[i] + ": " + fulltext[i].length());
        }
    }
    static void task_3(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        System.out.println("Введите среднее число строк: ");
        int middle = sc2.nextInt();
        String[] fulltext = new String[n];
        String swap = "";
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСтрока №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }
            for (int i = 0; i < n; ++i) {
                if (fulltext[i].length() < middle ) {
                    swap += fulltext[i] + ": " + fulltext[i].length() + "\n";
                }
                else {continue;}
            }
        System.out.println("Результат: \n"+swap);
    }

    static void task_4(){
        
    }

    }