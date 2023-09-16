package arrays.multi.task;

import java.util.Scanner;

public class Main {
    private static final int WIN_NUM=27;

    public static void main(String[] args) {

        // Оголошення та створення масиву.
        // 4 рядки, 4 стовпця
        int[][] nums4 = {
                {5, 16, 23, 56}, {3, 27, 52, 84},
                {76, 43, 69, 92}, {8, 11, 33, 55}
        };
        boolean isWin=false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter searching int value: ");
        int search = scanner.nextInt();

        // Пошук значення.
        // Перебір за допомогою циклу for-each
        for (int[] nums3 : nums4) {
            for (int value : nums3) {
                        if (value == WIN_NUM & search==WIN_NUM) {
                            isWin = true;
                            break;
                }
            }
        }

        if (isWin)
            System.out.println(" match(es) of value " +
                    search + " you are winner.");
        else System.out.println(" match(es) of value " +
                search + " you are not winner.");

    }
}
