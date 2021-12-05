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
        System.out.println("Введите количество строк: ");
        int n = sc.nextInt();
        String[] fulltext = new String[n];
        for (int i = 0; i <= n; i++ ){
            System.out.printf("\nСтрока №%s\n", (i+1));
            fulltext[i] = sc.nextLine();
        }
    }
    }