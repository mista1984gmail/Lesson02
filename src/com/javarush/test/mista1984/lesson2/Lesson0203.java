package com.javarush.test.mista1984.lesson2;
import java.util.Scanner;
/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0203
{
    public static void main(String[] args)
    {

        System.out.print("Введите число a: ");
        Scanner in1 = new Scanner(System.in);
        int a;
        a = in1.nextInt();
        System.out.print("Введите  число b: ");
        Scanner in2 = new Scanner(System.in);
        int b;
        b = in1.nextInt();
        System.out.print("Введите  число c: ");
        Scanner in3 = new Scanner(System.in);
        int c;
        c = in1.nextInt();
        if (a>=b & a>=c)
            System.out.println("Максимальное число :"+a);
        else if (b>=a & b>=c)
            System.out.println("Максимальное число :"+b);
        else if (c>=a & c>=b)
            System.out.println("Максимальное число :"+c);
    }
}
