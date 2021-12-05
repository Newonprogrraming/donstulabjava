package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class LabaThreeString {
    public static void main(String[] args) {
        task_1();
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
                    fulltext[i] = swap;
                    fulltext[i - 1] = fulltext[i];
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (fulltext[i].length() > fulltext[i + 1].length()) {
                    swap = fulltext[i];
                    fulltext[i+1] = swap;
                    fulltext[i] = fulltext[i+1];
                }
            }
            --right;
        }
        for (int i = 0; i < n; i++ ){
            System.out.println(fulltext[i] + ": " + fulltext[i].length());
        }
    }
    }