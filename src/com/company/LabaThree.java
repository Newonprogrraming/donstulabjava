package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class LabaThree {
    public static void main(String[] args) {
//        task_1("abcdefghijklmnopqrstuv183401");
        task_2("e02fd0e4-00fd-090A-ca30-0d00a0038ba0");
        task_3("aE:dC:cA:56:76:54");
        task_4("http://www.a.com");
        task_5("#000000");
        task_6("31/12/1600");
        task_7("hi@als");
        task_8("155.1.1.1");
        task_9("AAoepass");
        task_10("123450");
        task_11("112.1 EU");
        task_12("2+");
        task_13("2+(()");
    }
    public static void task_1(String a){
        String pt = "abcdefghijklmnopqrstuv18340";
        if (a.matches(pt)){
            System.out.println("Строка подходит");
        } else {
            System.out.println("Строка не подходит");
        }
    }

    static void task_2(String a) {
        Pattern pt = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }
    static void task_3(String a){
        Pattern pt = Pattern.compile("^([a-fA-F]{2}:){3}([0-9]{2}:){2}[0-9]{2}");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }
    static void task_4(String a){
        Pattern pt = Pattern.compile("^(https?|http)://www.[-a-zA-Z0-9+#/%=.]*[-a-zA-Z0-9+#/%=]");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }
    static void task_5(String a) {
        Pattern pt = Pattern.compile("^#[A-F0-9]{6}");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }
    static void task_6(String a) {
        Pattern pt = Pattern.compile("(0?[1-9]|[12][\\d]|3[01])/(0?[1-9]|1[0-2])/(1?[6-9]|[2-9]\\d)\\d\\d");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_7(String a) {
        Pattern pt = Pattern.compile("^[a-z]@(a-z|.[com])");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_8(String a){
        Pattern pt = Pattern.compile("(1?\\d\\d|2?[1-4]\\d|2?5[0-5]|[1-9]\\d).(1?\\d\\d|2?[1-4]\\d|2?5[0-5]|[1-9]\\d|0?|1?).(1?\\d\\d|2?[1-4]\\d|2?5[0-5]|[1-9]\\d|0?|1?).(1?\\d\\d|2?[1-4]\\d|2?5[0-5]|[1-9]\\d|0?|1?)");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_9(String a) {
        Pattern pt = Pattern.compile("((?=.+[a-z])(?=.+[A-Z]))(?=^.{8,}$)");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_10(String a){
        Pattern pt = Pattern.compile("([1-9]){6}");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_11(String a){
        Pattern pt = Pattern.compile("((\\w)+.(\\w)+)\\s(USD|EU|RUB)");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }

    static void task_12(String a){
        Pattern pt = Pattern.compile("\\d+[+]|\\d+ [+]");
        Matcher m1 = pt.matcher(a);
        boolean b = m1.matches();
        System.out.println(b);
    }
    static void task_13(String a){
        int sumopen = 0;
        int sumclose = 0;
        Pattern pt = Pattern.compile("[\\(]");
        Pattern pt2 = Pattern.compile("[\\)]");
        Matcher m2 = pt2.matcher(a);
        Matcher m1 = pt.matcher(a);
        while (m1.find()){
            sumopen +=1;}
        while (m2.find()){
            sumclose +=1;}
        if (sumopen == sumclose){
            System.out.println("ОК");
        }else{System.out.println("No found");}
    }
}
