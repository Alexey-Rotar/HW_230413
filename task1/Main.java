package org.example.hw230413.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumPositive(scanner));
        scanner.close();
    }

    /**
     *
     * @param scanner
     * @return Cумма положительных чисел, после которых следует отрицательное число;
     */
    public static int sumPositive(Scanner scanner){
        int sum = 0;
        int a = scanner.nextInt();
        while (a !=0 ) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        return sum;
    }
}