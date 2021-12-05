package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabaOne {
    public static void main(String[] args) {
//        task_one();
//        task_two();
//        task_three();
//        task_four();
//        task_five();
//        task_six();
//        task_seven();
        task_eight();
task_nine();
task_ten();
//        task_11();
//        task_12();
//        task_13();

    }
    public static void task_one(){
        System.out.println("\nЗадание №1\n");
        int min = 999999999;
        int lg;
        String minstr = "";
        String choice;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку: ");
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
        System.out.println("\nЗадание №2\n");
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
        System.out.println("\nЗадание №3\n");
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
                System.out.print("Вы ввели не число.\n");
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
                System.out.println(str[i]+" : Длина: " + str[i].length());
            }
        }

    }

    static void task_four(){
        System.out.println("\nЗадание №4\n");
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
        System.out.println("\nЗадание №5\n");
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

    static void task_six(){
        System.out.println("\nЗадание №6\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String a = sc.nextLine();
        String b = a.replaceAll("[^a-zA-Z]+", " ");
        System.out.println(b);
    }

    static void task_seven(){
        System.out.println("\nЗадание №7\n");
        Scanner sc = new Scanner(System.in);
        String newtext = "";
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        System.out.println("Введите длину слова: ");
        int scored = 0;
        int lengthword = sc.nextInt();
        String [] strword = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};
        String [] words = text.split(" ");
        for (String s: words){
            for (int i=0; i < strword.length; i++){
            if (s.length() == lengthword && s.toLowerCase().contains(strword[i])){
                scored += 1;
            }}
            if (scored < 1){
                newtext += s + " ";
            }
            scored = 0;
        }
        System.out.println(newtext);
    }

    static void task_eight(){
        System.out.println("\nЗадание №8\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String sctext = sc.nextLine();
        StringBuilder text = new StringBuilder();
        text.append(sctext);
        text.reverse();
        System.out.println(text);
    }

    static void task_nine(){
        System.out.println("\nЗадание №9\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        String word = "";
        int index = 1;
        String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        Arrays.sort(words);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                index++;
            } else if (!words[i].equals(words[i - 1])) {
                word = words[i - 1];
                System.out.println("Слово '" + word + "' встречается в тексте: " + index + " раз.");
                index = 1;
            }
            word=words[i-1];
        }
        System.out.println("Слово '" + word + "' встречается в тексте: " + index + " раз.");
    }

    static void task_ten(){
        System.out.println("\nЗадание №10\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();

        int sumcogl = 0;
        int sumglas = 0;
        Pattern pt = Pattern.compile("[БВГДЖЗЙКЛМНПРСТФХЧЦШЩбвгджзйклмнпрстфхчцшщ]");
        Pattern pt2 = Pattern.compile("[АЕЁИОУЫЭЮЯаеёиоуыэюя]");
        Matcher lasn = pt2.matcher(text);
        Matcher coglasn = pt.matcher(text);
        while (coglasn.find()){
            sumcogl +=1;}
        while (lasn.find()){
            sumglas +=1;}
        System.out.println("Согласных: " + sumcogl);
        System.out.println("Гласных: " + sumglas);
    }
    static void task_11(){
        System.out.println("\nЗадание №11\n");

    }
    static void task_12(){System.out.println("\nЗадание №12\n");}
    static void task_13(){System.out.println("\nЗадание №13\n");}


}
