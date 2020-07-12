package hw4;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int value = in.nextInt();
        int result = sum(value);
        System.out.println(result);
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
}
