package BubbleSort;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sc = new Scanner(System.in);

    public static void sort(int[] array) {
        System.out.println("press 1 to sort the array in ascending order");
        System.out.println("press 2 to sort the array in desending order");
        int choice = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (choice == 1) {
                    ascendingSort(array, j);
                } else {
                    desendingSort(array, j);
                }

            }
        }
    }

    private static void desendingSort(int[] array, int j) {
        if (array[j] < array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }

    private static void ascendingSort(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }


    }
}
