// Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int sum = 0, n, a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        n = scanner.nextInt();
        
        System.out.println("Введите элементы: ");

        for (int i = 1; i <= n; i++) {
            a = scanner.nextInt();
            sum += a;
            if (a > 0) {
                for (int k = 2; k <= Math.sqrt(a); k++) {
                    if (a % k == 0) {
                        sum -= a;
                        break;
                    }
            }} else {
                sum -= a;
            }
        }
        System.out.println("Сумма = " + sum);
        scanner.close();
    }
}

