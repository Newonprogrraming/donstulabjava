package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabaOne {
    public static void main(String[] args) {
        //task_one();
        //task_two();
        //task_three();
        //task_four();
        task_five();
    }
    public static void task_one(){
        int min = 999999999;
        int lg;
        String minstr = "";
        String choice;
        Scanner sc = new Scanner(System.in);
        while (true){
            choice = sc.nextLine();
            lg = choice.length();
            if (choice == ""){
                break;
            }
            if (lg < min){
                min = lg;
                minstr = choice;
            }

        }
        System.out.println("Минимальна строчка: "+ minstr);
         System.out.println("Число символов:  "+ min);
    }
    static void task_two() {
        int n = 0;
        while (true) // ввод числа строк
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System.in);
            try {
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException fg) {
// если введенное значение не является числом
                System.out.print("Вы ввели не число. ");
            }
        }
// создание массива строк
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }
//сортировка массива строк по длине
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].length() > str[j].length()) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Строки в порядке убывания длины:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i] + "её длина: " + str[i].length());
        }
    }

    static void task_three(){
        int n = 0;
        int median = 0;
        while (true) // ввод числа строк
        {
            Scanner sc1 = new Scanner(System.in);
            try {
                System.out.println("Введите число строк");
                n = sc1.nextInt();
                System.out.println("Введите число средней длинны строк");
                median = sc1.nextInt();
                break;
            } catch (InputMismatchException fg) {
// если введенное значение не является числом
                System.out.print("Вы ввели не число. ");
            }
        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }
        System.out.println("Строки длина которых меньше средней");
        for (int i = 0; i < n; i++){
            if (str[i].length() < median){
                System.out.println(str[i]+" ; Длина: " + str[i].length());
            }
        }

    }

    static void task_four(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String a = sc.nextLine();
        System.out.println("Введите букву, которую нужно заменить: ");
        String changeword = sc.nextLine();
        System.out.println("Введите символ, на который нужно заменить: ");
        String changesymbol = sc.nextLine();
        Pattern pt = Pattern.compile(changeword);
        Matcher m1 = pt.matcher(a);
        String b = m1.replaceAll(changesymbol);
        System.out.println(b);
    }

    static void task_five(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String choice = sc.nextLine();
        String  ab = choice;
        for(char ch : ab.toCharArray()){
            int a = ch;
            if (a-1071 > 0){
                System.out.print(a-1071 + "  ");
            } else if(a-1039>0) {
                System.out.print(a-1039+ "  ");
            } else {
                char string = (char) a;
                System.out.print(string);
            }
        }
        System.out.println();
        System.out.println("Второй вид записи");
        for(char ch : ab.toCharArray()){
            int a = ch;
            if (a-1071 > 0){
                char string = (char) a;
                System.out.print(string + ":"+ (a-1071)+ " ");
            } else if(a-1039>0) {
                char string = (char) a;
                System.out.print(string + "\n"+ (a-1039));
            } else {
                char string = (char) a;
                System.out.print(string);
            }
        }


    }
}
