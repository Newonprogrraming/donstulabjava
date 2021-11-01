package com.company;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProWork {
    public static void main(String[] args) {
        //task_one();
        //task_two();
//        task_19(3);

//        task_20(10);
        task_21();
   }
    public static int[] randomArray(int a){
        Random rn = new Random();

        int[] array = new int[a];
        for (int i = 0; i < a; i++ ){
            array[i] = rn.nextInt(100)-rn.nextInt(90);
        }
        return array;
    }


    static void task_one(){
        int[] x = randomArray(20);
        int[] y = randomArray(15);
        Arrays.sort(x);
        Arrays.sort(y);
        int x_max = x[19];
        int y_max = y[14];

        System.out.println(x[19]);
        System.out.println(y[14]);
        double z;
        z = (Math.exp(Math.abs(x_max)) - Math.exp(Math.abs(y_max))) / (Math.sqrt(x_max * y_max));
        System.out.println(z);
    }


    static void task_two() {
        float X = middlearifm(5);
        System.out.println(X);
    }
    public static float middlearifm(int sizeArray){
        int sum = 0;
        int schet = 0;
        int[] a = randomArray(sizeArray);
        for (int i = 0; i < sizeArray; i++){
            System.out.println(a[i]);
            if (a[i] > 0){
                sum += a[i];
                schet += 1;
            }
        }
        return sum/schet;
    }


    static void task_19(int sizematrx){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);


        int sumMainDiagonal = 0;
        int sum_side_diagonal = 0;

        int[][] array = new int[sizematrx][sizematrx];
        for (int i = 0; i < sizematrx; i++ ){
            for(int j = 0; j < sizematrx; j++) {
                array[i][j] = rn.nextInt(100) - rn.nextInt(90);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Для нахождения суммы главной диагонали нажмите [1]");
        System.out.println("Для нахождения суммы побочной диагонали нажмите [2]");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                for (int i = 0; i < sizematrx; i++){
                    sumMainDiagonal += array[i][i];
                }
                System.out.println(sumMainDiagonal);
                break;

            case 2:
                int a = sizematrx;
                for (int i=0; i < sizematrx; i++){
                    a -= 1;
                    sum_side_diagonal += array[i][a];
                }
                System.out.println(sum_side_diagonal);
                break;
        }

    }

    static void task_20(int val){
        System.out.println(Integer.toString(val, 2));
    }


    static void task_21(){
        float y;
        for (int x = -10; x <= 10; x ++) {
            if (x >= -5 & x <= 5) {
                y = x * 2;
                System.out.printf("x = %s; y = %s\n", x,y);
            } else if (x < -5) {
                y = 2 * Math.abs(x) - 1;
                System.out.printf("x = %s; y = %s\n", x,y);
            } else if (x > 5) {
                y = 2 * x;
                System.out.printf("x = %s; y = %s\n", x,y);
            }

        }
    }
}
