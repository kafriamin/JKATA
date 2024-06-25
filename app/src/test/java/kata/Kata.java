package kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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

    @Test
    void linkedList() {
        kata.LinkedList<Integer> ll = new kata.LinkedList<>();
        assertNull(ll.getFirst());
        assertNull(ll.removeFirst());
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 }; // len = 7
        for (int i = 0; i < arr.length; i++) {
            ll.addLast(arr[i]);
        }

        // Get Initial info
        assertEquals(arr.length, ll.getSize());
        assertEquals(arr[0], ll.getFirst());
        assertEquals(arr[arr.length - 1], ll.getLast());

        // Remove last element
        // len = 6
        int last = ll.removeLast();
        assertEquals(arr[arr.length - 1], last);
        assertEquals(6, ll.getSize());
        assertEquals(90, ll.getLast());

        // Add to first
        // Len = 7
        ll.addFirst(33);
        assertEquals(33, ll.getFirst());
        assertEquals(7, ll.getSize());

        // Remove First
        // Len = 6
        int first = ll.removeFirst();
        assertEquals(33, first);
        assertEquals(6, ll.getSize());

        // Removed Second Index
        // Len = 5
        int removed = ll.remove(2);
        assertEquals(arr[2], removed);
        assertEquals(5, ll.getSize());

        // Insert at second index
        // Len = 6
        ll.insert(2, arr[2]);
        int sec = ll.get(2);
        assertEquals(arr[2], sec);

    }

        @Test
    void stack() {
        kata.Stack<Integer> s = new kata.Stack<>();
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 }; // len = 7
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        assertEquals(arr.length, s.getSize());

        s.push(33);
        assertEquals(33, s.peek());
        assertEquals(arr.length + 1, s.getSize());

        int popopopopo = s.pop();
        assertEquals(33, popopopopo);
        assertEquals(arr.length, s.getSize());
    }


    @Test
    void queue() {
        kata.Queue<Integer> q = new kata.Queue<>();
        assertNull(q.dequeue());
        int arr[] = { 64, 34, 25, 12, 22, 90, 11 }; // len = 7
        for (int i = 0; i < arr.length; i++) {
            q.enqueue(arr[i]);
        }
        assertEquals(arr.length, q.getSize());

        int d = q.dequeue();
        assertEquals(64, d);

        int d2 = q.dequeue();
        assertEquals(34, d2);

        assertEquals(5, q.getSize());

    }

}
