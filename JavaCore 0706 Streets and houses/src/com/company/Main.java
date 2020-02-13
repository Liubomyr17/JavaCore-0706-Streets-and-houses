package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0706 Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывеси на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

Требования:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0, c = 0;
        int[] a = new int[15];
        for(int i=0; i<a.length; i++) {
            a[i]=Integer.valueOf(reader.readLine());
            if(i%2==0) {
                b=b+a[i];
            } else c = c+a[i];
        } if(b > c) {
            System.out.println("Even-numbered houses have more residents.");
        } else
            System.out.println ("Odd number houses have more inhabitants.");
    }
}








