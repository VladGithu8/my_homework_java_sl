package searchpackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void firstSearchMyElementTest() {

        BinarySearch binarySearch = new BinarySearch();
        int[] mySortedArray = {0, 1, 4, 6, 29, 76, 80, 243, 555, 800}; // 10 elements

        int expected = 8;
        System.out.println("Need to find index of 555");
        int actual = binarySearch.searchMyElement(mySortedArray, 555);
        System.out.println("Index of 555 is: " + actual);
        System.out.println("--------------------------");

        assertEquals(expected, actual);
    }

    @Test
    void secondSearchMyElementTest() {

        BinarySearch binarySearch1 = new BinarySearch();
        int[] mySortedArray1 = {1, 4, 7, 18, 19, 76, 89, 166, 756, 799}; // 10 elements

        int expected = 5;
        System.out.println("Need to find index of 76");
        int actual = binarySearch1.searchMyElement(mySortedArray1, 76);
        System.out.println("Index of 76 is: " + actual);
        System.out.println("--------------------------");

        assertEquals(expected, actual);
    }
}

