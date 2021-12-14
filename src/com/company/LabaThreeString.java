package com.company;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class LabaThreeString {
    public static void main(String[] args) {
        task_9();
        System.out.println("~Вторая часть~");
        boolean check = true;
        while (check){
            Scanner sc = new Scanner(System.in);
            System.out.println("Напишите номер задания [Для выхода нажмите Enter]: ");
            String task = sc.nextLine();
            if(task == ""){break;}
            switch (task){
                case "10": task_10("I like Java!!!");break;
                case "11": task_11(25,17);break;
                case "12": task_12();break;
                case "13": task_13();break;
                case "14": task_14();break;
                case "15": task_15();break;
                case "16": task_16();break;
                case "17": task_17();break;
                case "18": task_18();break;
                case "19": task_19();break;
            }
        }
        task_11(10,15);
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
        StringBuilder swap = new StringBuilder();
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСтрока №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }
            for (int i = 0; i < n; ++i) {
                if (fulltext[i].length() < middle ) {
                    swap.append(fulltext[i]).append(": ").append(fulltext[i].length()).append("\n");
                }
                else {continue;}
            }
        System.out.println("Результат: \n"+swap);
    }

    static void task_4(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество n слов: ");
        int n = sc.nextInt();
        int min = 100000;
        String[] fulltext = new String[n];
        String swap = "";
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСлово №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }

        //Сортировка расчёской
        double factor = 1.247; // Фактор уменьшения
        int step = n-1;

        while (step >= 1) {
            for (int i = 0; i + step < n; ++i) {
                if (fulltext[i].length() <= min ) {
                    swap = fulltext[i];
                    min = fulltext[i].length();
                }
            }
            step /= factor;
        }
        System.out.println(swap + ": " + min);
    }
    static void task_5(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество n слов: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСлово №%s\n", (i+1));
            arr[i] = sc1.nextLine();
        }
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        List<Character> invowels = Arrays.asList('b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z');
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        HashSet<Character> ch_set =new HashSet<Character>();
        byte counter = 0;
        int count_vowel = 0;
        int count_invowel =0;


        for (String arr1 : arr){
            count_vowel =0;
            count_invowel = 0;
            Matcher matcher = pattern.matcher(arr1);
            if (matcher.matches()){
                for (int i=0; i<arr1.length(); i++){
                    ch_set.add(arr1.charAt(i));
                    if (vowels.contains(arr1.charAt(i))){count_vowel+=1;}
                    else if (invowels.contains(arr1.charAt(i))){count_invowel+=1;}
                }
                if (count_vowel == count_invowel){System.out.println("Подxодящие строки:  "+ arr1);counter+=1;}
                else {System.out.println(arr1 +" => "+ "Гласных букв:  "+count_vowel+"  Согласных букв: "+count_invowel);}
            }
        }
        System.out.println("Итоговое количество слов, удовлетворяющих условиям:  "+ counter);
    }

    static void task_7(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество n слов: ");
        int n = sc.nextInt();
        String[] fulltext = new String[n];
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСлово №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }

        HashSet <Character> letters = new HashSet <>();
        for (String arr1 : fulltext){
            for (int i =0 ; i<arr1.length();i++){
                letters.add(arr1.charAt(i));
            }
            if(letters.size() == arr1.length()){System.out.printf("Все символы строки -%s- различны!\n",arr1);}
            letters.clear();
        }
    }
    static void task_8(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество n слов: ");
        int n = sc.nextInt();
        String[] fulltext = new String[n];
        for (int i = 0; i < n; i++ ){
            System.out.printf("\nСлово №%s\n", (i+1));
            fulltext[i] = sc1.nextLine();
        }
        String result;
        for (String array : fulltext){
            result = "";
            for (int i = array.length()-1; i>=0; i--) {
                result+=Character.toString(array.charAt(i));
            }
            if (result.equals(array)){System.out.printf("Строка -%s- является палиндромом! \n", array);
            }
        }
    }

    static void task_9(){
        boolean check = true;
        while (check){
            Scanner sc = new Scanner(System.in);
            System.out.println("Напишите номер задания [Для выхода нажмите Enter]: ");
            String task = sc.nextLine();
            if(task == ""){break;}
            switch (task){
                case "1": task_1();break;
                case "2": task_2();break;
                case "3": task_3();break;
                case "4": task_4();break;
                case "5": task_5();break;
                case "7": task_7();break;
                case "8": task_8();break;
            }
        }

    }

    static void task_10(String str){
        String changetext = "";
        changetext=changetext.concat(str);
        System.out.println("б)  "+str.charAt(changetext.length()-1));
        str=changetext;
        System.out.println("в)  "+str.endsWith("!!!"));
        str=changetext;
        System.out.println("г)  "+str.startsWith("I like"));
        str=changetext;
        System.out.println("д)  "+changetext.contains("Java"));
        str=changetext;
        System.out.println("е)  "+changetext.indexOf("Java"));
        changetext=changetext.replaceAll("a", "o");
        System.out.println("ж)  "+changetext);
        changetext = str.toUpperCase();
        System.out.println("з)  "+changetext);
        changetext = str.toLowerCase();
        System.out.println("и)  "+ changetext);
        changetext = str.substring(6);
        System.out.println("к)  "+changetext);
    }
    static void task_11(int a, int b){
        StringBuilder res = new StringBuilder();
        String [] arr = {"+","-","*"};
        int index;
        index = 0;
        res.append(a).append("+").append(b).append("=");
        index = a+b;
        res.append(index);
        System.out.println(res);
        res.delete(0, res.length());

        res.append(a).append("-").append(b).append("=");
        index = a-b;
        res.append(index);
        System.out.println(res);
        res.delete(0, res.length());

        res.append(a).append("*").append(b).append("=");
        index = a*b;
        res.append(index);
        System.out.println(res);
        res.delete(0, res.length());
    }

    static void task_12(){
        int check = 0;
        StringBuffer my_str = new StringBuffer("Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
        Pattern pattern = Pattern.compile("[oO]bject-[oO]riented [pP]rogramming");
        Matcher matcher = pattern.matcher(my_str);
        while(matcher.find()){
            if(check != 0){
                my_str.delete(matcher.start(), matcher.end());
                my_str.insert(matcher.start(),"OOP" );
                check = 0;
            }
            else if (check == 0){check=1;}
        }

        System.out.println(my_str);
    }
    static void task_13(){
        String [] text = {"code", "String","practice"};
        int index;
        for (String example: text ){
            index = (example.length()/2)-1;
            System.out.println(example+ " - "+example.substring(index, index+2));
        }
    }

    public static void task_14(){
        String my_str = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        System.out.println(my_str);
        String regex = "Java[\\s\\d]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(my_str);
        while(matcher.find()){System.out.println(my_str.substring(matcher.start(), matcher.end()));}
    }
    public static void task_15(){
        String my_str = "fffff ab f 1234 jkjk";
        System.out.println(my_str);
        HashSet<Character> letters= new HashSet<>();
        String [] arr = my_str.split(" ");
        for(String arr1: arr){
            for(byte i = 0; i<arr1.length();i++){
                letters.add(arr1.charAt(i));
            }
            if (letters.size()==1 && arr1.length()>1){System.out.println("---"+arr1);}
            letters.clear();
        }
    }
    public static void task_16(){
        String str_1="One two three раз два три one1 two2 123 ";
        System.out.println(str_1);
        String[] str = str_1.split("\\s+");
        int sum = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        for (String textarr : str) {
            Matcher matcher = pattern.matcher(textarr);
            if (matcher.matches()) {
                sum += 1;
                System.out.println(String.valueOf(textarr));

            }}
        System.out.println("\tИтоговое количество слов:  "+sum);


    }
    public static void task_17(){

        String str = "Если есть хвосты по дз, начните с первого несданного задания. 123 324 111 4554";
        System.out.println(str);
        String [] arr = str.split("\\s+");
        String result;
        for (String textarr : arr){
            result = "";
            for (int i = textarr.length()-1; i>=0; i--) {
                result+=Character.toString(textarr.charAt(i));
            }
            if (result.equals(textarr)){System.out.printf("Строка -%s- является палиндромом! \n", textarr);}
        }}
    public static void task_18(){
        String [] arr = {"cab", "ccab", "cccab","aaab"};
        Pattern pattern = Pattern.compile("c*a*b"); //before - "a*b"
        for(String textarr : arr){
            Matcher matcher = pattern.matcher(textarr);
            boolean b = matcher.matches();
            System.out.println(textarr+"  -  "+b);
        }
    }
    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");// before - "(com|ua|ru)"
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
    public static void task_19() {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.ua"));
        System.out.println(test("reference1.org"));
    }
    }