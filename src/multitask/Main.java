package multitask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Оголошення та створення масиву.
        // 4 рядки, 4 стовпця
        int[][] nums4 = {
                { 5, 16, 23, 56 }, { 3, 27, 52, 84 },
                { 76, 43, 69, 92 }, { 8, 11, 33, 55 },
        };
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter searching int value: ");
        int search = scanner.nextInt();

        // Пошук значення.
        // Перебір за допомогою циклу for-each
        for (int[] nums3 : nums4) {
            for (int nums2 : nums3) {
                for (int nums1 : nums2) {
                    for (int value : nums1) {
                        if (value == search) {
                            count++;
                        }
                    }
                }
            }
        }

        if (count > 0)
            System.out.println(count + " match(es) of value " +
                    search + " winner.");
        else System.out.println("No match(es) of value " +
                search + " try again next time.");

    }
}
