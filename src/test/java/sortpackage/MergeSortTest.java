package sortpackage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void firstMergeSortTest() {

        System.out.println("First MergeSortTest");
        int[] myArray = {10, 15, 18, 30, 40, 23, 77, 1, 900, 178}; // 10 elements

        List<Integer> actual = new ArrayList<>();
        List<Integer> notSorted = new ArrayList<>();

        System.out.println("Not sorted");
        for (int j : myArray) {
            notSorted.add(j);
        }
        System.out.println(notSorted.toString());

        new MergeSort().prepare(myArray);
        System.out.println("Sorted");
        for (int j : myArray) {
            actual.add(j);
        }
        System.out.println(actual.toString());
        System.out.println("-----------------------------------");

        List<Integer> expected = Arrays.asList(1, 10, 15, 18, 23, 30, 40, 77, 178, 900);
        assertEquals(expected, actual);
    }

    @Test
    void secondMergeSortTest() {

        System.out.println("Second MergeSortTest");
        int[] myArray = {260, 14, 45, 22, 65, 450, 8, 2, 31, 7}; // 10 elements

        List<Integer> actual = new ArrayList<>();
        List<Integer> notSorted = new ArrayList<>();

        System.out.println("Not sorted");
        for (int j : myArray) {
            notSorted.add(j);
        }
        System.out.println(notSorted.toString());

        new MergeSort().prepare(myArray);
        System.out.println("Sorted");
        for (int j : myArray) {
            actual.add(j);
        }
        System.out.println(actual.toString());
        System.out.println("-----------------------------------");

        List<Integer> expected = Arrays.asList(2, 7, 8, 14, 22, 31, 45, 65, 260, 450);
        assertEquals(expected, actual);

    }
}

