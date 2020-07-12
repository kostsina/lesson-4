package hw4;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int N = in.nextInt();
        System.out.println("Введите величину осадков в день:");
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {

            int current = in.nextInt();
            sum += current;
            if (current > max) {
                max = current;
            }
        }
        double average = (double) sum /N;
        output(N, sum, max, average);
    }

    public static void output(int N, int sum, int max, double average) {
        System.out.println("a." + N);
        System.out.println("b." + sum);
        System.out.println("c." + average);
        System.out.println("d." + max);
    }
}
