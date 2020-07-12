package hw4;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 */

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int value = in.nextInt();
        int x = 1;
        int y = 1;
        int z = x + y;
        System.out.print(x + " " + y + " ");
        count(value, x, y, z);
    }

    public static void count(int value, int x, int y, int z) {
        while (z < value) {
            System.out.print(z + " ");
            x = y;
            y = z;
            z = x + y;
        }
    }
}
