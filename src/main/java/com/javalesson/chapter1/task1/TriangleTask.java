package com.javalesson.chapter1.task1;

import java.util.Scanner;

/**
 * Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 * сторонами треугольника.
 * Для ввода значений с консоли Вам понадобится класс Scanner.
 * <code>Scanner scanner = new Scanner(System.in);</code>
 * <code>scanner.nextInt();</code>
 */
public class TriangleTask {

    public static void main(String[] args) {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Please enter the first side");
        int sideOne = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.println("Please enter the second side");
        int sideTwo = in3.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the third side");
        int sideThree = in.nextInt();

        if ((sideOne + sideTwo) > sideThree
                && (sideOne + sideThree) > sideTwo
                && (sideTwo + sideThree) > sideOne) {
            System.out.println("These sides can form a valid triangle!");
        } else {
            System.out.println("These sides can not form the triangle :(");
        }

    }
}