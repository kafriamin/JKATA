package kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Kata {
    @Test
    @DisplayName("bubbleSort")
    void bubbleSort() {
        BubbleSort bs = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 90, 11};
        bs.bubbleSort(arr);
        assertEquals(arr[0], 11);
        assertEquals(arr[3], 25);
        assertEquals(arr[arr.length - 1], 90);
        assertEquals(arr[arr.length - 2], 64);
    }

    @Test
    void binarySearch() {
        BinarySearch bs = new BinarySearch();
        int[] sorted_arr = {11, 12, 22, 25, 34, 64, 90};
        assertEquals(bs.binarySearch(sorted_arr, 34), true);
        assertEquals(bs.binarySearch(sorted_arr, 64), true);
        assertEquals(bs.binarySearch(sorted_arr, 100), false);

    }

    @Test
    void linearSearch() {
        LinearSearch ls = new LinearSearch();
        int[] sorted_arr = {11, 12, 22, 25, 34, 64, 90};
        assertEquals(ls.linearSearch(sorted_arr, 34), true);
        assertEquals(ls.linearSearch(sorted_arr, 64), true);
        assertEquals(ls.linearSearch(sorted_arr, 100), false);
    }

    @Test
    void selectionSort() {
        SelectionSort ss = new SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 90, 11};
        ss.selectionSort(arr);
        assertEquals(arr[0], 11);
        assertEquals(arr[3], 25);
        assertEquals(arr[arr.length - 1], 90);
        assertEquals(arr[arr.length - 2], 64);
    }


    @Test
    void insertionSort() {
        InsertionSort is = new InsertionSort();
        int arr[] = {64, 34, 25, 12, 22, 90, 11};
        is.insertionSort(arr);
        assertEquals(arr[0], 11);
        assertEquals(arr[3], 25);
        assertEquals(arr[arr.length - 1], 90);
        assertEquals(arr[arr.length - 2], 64);
    }

    @Test
    void mergeSort() {
        MergeSort ms = new MergeSort();
        int arr[] = {64, 34, 25, 12, 22, 90, 11};
        ms.mergeSort(arr);
        assertEquals(arr[0], 11);
        assertEquals(arr[3], 25);
        assertEquals(arr[arr.length - 1], 90);
        assertEquals(arr[arr.length - 2], 64);
    }

}

