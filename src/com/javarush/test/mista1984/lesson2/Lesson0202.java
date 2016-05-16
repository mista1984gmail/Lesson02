package com.javarush.test.mista1984.lesson2;
import java.util.Scanner;

/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0202
{
    public static void main(String[] args)
    {
        System.out.print("Введите  целое число: ");
        Scanner in1 = new Scanner(System.in);
        int num1;
        num1 = in1.nextInt();
        System.out.print("Введите  целое число: ");
        Scanner in2 = new Scanner(System.in);
        int num2;
        num2 = in2.nextInt();
        System.out.println("Сумма чисел: " + (num1+num2));

    }
}
