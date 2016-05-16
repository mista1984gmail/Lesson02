package com.javarush.test.mista1984.lesson2;
import java.util.Scanner;

/**
 * Created by USER on 16.05.2016.
 */
public class Lesson0201
{
    public static void main(String[] args)
    {
        System.out.print("Введите  целое число: ");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        if (num%2==0)
            System.out.println("число четное");
        else if (num%2!=0)
            System.out.println("число нечетное");
        else
            System.out.println("ОШИБКА: Ведите целое число");

    }
}
