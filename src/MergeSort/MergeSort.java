package MergeSort;

public class MergeSort {
    public static void sort(int[] array) {
        if (array.length > 1) {
            int half = array.length / 2;
            int[] leftArray = new int[half];
            int[] rightArray = new int[array.length - half];
            System.arraycopy(array, 0, leftArray, 0, half);
            System.arraycopy(array, half, rightArray, 0, array.length - half);
            sort(leftArray);
            sort(rightArray);
            merge(array, leftArray, rightArray);
        }
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
