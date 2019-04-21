package com.javalesson.chapter1.task2;

import java.util.Scanner;

/**
 * Напишите программу, которая принимает заранее неизвестное количество оценок
 * считает общую сумму оценок и среднее значение.
 * Оценки должны быть получены с консоли и от запуска к запуску их количество может меняться.
 * Для этого вам понадобится один из циклических операторов с заранее не известным количеством циклов.
 * Вспомните, какие бывают циклические операторы и в чем особенность каждого из них.
 * Так же вам понадобится определенное значение, которое будет обозначать завершение обработки
 * входящих данных и переход к вычислениям. Так как оценки не могут быть отрицательными,
 * можно использовать отрицательное целое значение (например -1 или -5) как указатель выхода из цикла.
 * <p>
 * Для выполнения задания Вам понадобится класс Scanner.
 * Создайте объект класса <code> Scanner scanner = new Scanner(System.in);</code>
 * Используя методы этого класса, Вы можете прочитать с консоли данные разного типа.
 * <code>
 * scanner.nextInt();
 * scanner.nextDouble();
 * scanner.nextLine();
 * scanner.nextFloat();
 * scanner.next();
 * </code>
 * <p>
 * После выполнения задания сверьтесь с тем что написано в  GradeCalculatorSolution.java.
 * <p>
 * Подумайте какие есть недостатки у решения в классе GradeCalculatorSolution.
 * <p>
 * Вам нужно предложить 2 улучшения. По желанию можно реализовать их самостоятельно (не обязательно).
 * Подсказка: одно из них реализовать очень просто.
 * Для второго Вам могут понадобиться знания из раздела Обработка исключений в Java.
 */
public class GradeCalculatorTask {

    public static void main(String[] args) {

        int sum = 0;
        int iteration = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the grade and press the Enter key.\n" +
                "If you want to stop entering grades and start calculating, enter zero");
        int grade = in.nextInt();

        while ((0 < grade) && (grade <= 5)) {
            sum += grade;
            iteration++;
            System.out.println("Please enter another grade and press the Enter key.\n" +
                    "If you want to stop entering grades and start calculating, enter zero, negative number or 6 or more");
            grade = in.nextInt();
        }

        if (iteration != 0) {
            double average = (double) sum / iteration;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    iteration, sum);
            System.out.printf("Class average is %.2f%n", average);
        } else
            System.out.println("No grades were entered");
    }
}
