package Main;

import BubbleSort.BubbleSort;
import MergeSort.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("howmany elements would you like to in the array?");
        int noOfElement = scanner.nextInt();
        int[] array = new int[noOfElement];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(array));
        System.out.println("press 1  to sort this array from Bubble sort");
        System.out.println("press 5 to sort this array from merge sort");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(array);
                System.out.println("sorted array by bubble sort");
                System.out.println(Arrays.toString(array));
                break;
            case 5:
                MergeSort.sort(array);
                System.out.println("sorted array by merge sort");
                System.out.println(Arrays.toString(array));
        }
    }
}
