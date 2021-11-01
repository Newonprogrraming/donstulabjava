package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        //zadanie3();
        zadanie4();
        zadanie5();

    }
    static void zadanie1(){
        System.out.println("We have to get out of here");
        System.out.println("We need transport");
    }
    static void zadanie2(){
        String str = "Destroy Droidekas!\n";
        String rep = str.repeat(5);
        System.out.println(rep);

    }
    static void zadanie3(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число астероидов: ");
        int ast = scn.nextInt();
        System.out.print("Введите число сбитых астероидов: ");
        int astsb = scn.nextInt();
        int razn = ast - astsb;
        Integer.toString(razn);
        System.out.println("Осталось: " + razn);

    }
    static void zadanie4(){
        String name = "Anakin";
        int heigh = 188;
        String planet = "Tatooine";
        System.out.println("My name is " + name + "\nMy heigh: " + heigh + "\nMy planet: " + planet );

    }
    static void zadanie5() {
        System.out.print("The");
        //System.out.print("Starship");
        //System.out.println(" car ");
        System.out.print(" car");
        System.out.print(" is ");
        System.out.print("ready ");
        System.out.print(" ready ");
        System.out.print("for");
        //System.out.println(" the");
        System.out.print(" the");
        System.out.println(" race");

    }
}
