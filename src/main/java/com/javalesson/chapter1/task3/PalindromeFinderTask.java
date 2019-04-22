package com.javalesson.chapter1.task3;


import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * <p>
 */
public class PalindromeFinderTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Please enter the positive number of 5 digits");
            int number = in.nextInt();
            String numberToStr = String.valueOf(number);

            if (number < 0) {
                System.out.println("The number should be positive! Try again:");
            } else if (numberToStr.length() != 5) {
                System.out.println("The number should consist of 5 digits!");
            } else {
                continueLoop = false;
                String reversed = "";
                for (int i = numberToStr.length() - 1; i >= 0; i--) {
                    reversed = reversed + numberToStr.charAt(i);
                }
                int reversedNum = Integer.parseInt(reversed);

                if (number == reversedNum) {
                    System.out.println("It's a palindrome!");
                } else {
                    System.out.println("Not a palindrome");
                }

            }
        }
    }
}