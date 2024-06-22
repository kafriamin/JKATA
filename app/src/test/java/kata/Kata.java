package kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Kata {
    @Test
    @DisplayName("bubbleSort")
    void bubbleSort() {
        BubbleSort bs = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 };
        bs.bubbleSort(arr);
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void binarySearch() {
        BinarySearch bs = new BinarySearch();
        int[] sortedArr = { 11, 12, 22, 25, 34, 64, 90 };
        assertTrue(bs.binarySearch(sortedArr, 34));
        assertTrue(bs.binarySearch(sortedArr, 64));
    }

    @Test
    void linearSearch() {
        LinearSearch ls = new LinearSearch();
        int[] sortedArr = { 11, 12, 22, 25, 34, 64, 90 };
        assertTrue(ls.linearSearch(sortedArr, 34));
        assertTrue(ls.linearSearch(sortedArr, 64));
    }

    @Test
    void selectionSort() {
        SelectionSort ss = new SelectionSort();
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 };
        ss.selectionSort(arr);
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void insertionSort() {
        InsertionSort is = new InsertionSort();
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 };
        is.insertionSort(arr);
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        assertArrayEquals(expected, arr);
    }

    @Test
    void mergeSort() {
        MergeSort ms = new MergeSort();
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 };
        ms.mergeSort(arr);
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        assertArrayEquals(expected, arr);
    }

}
