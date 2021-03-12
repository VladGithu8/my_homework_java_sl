package sortpackage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class SortBubbleTest {

    @Test
    void firstBubbleSortArrayTest() {

        SortBubble sortBubble = new SortBubble();
        int[] myArray = {800, 243, 6, 76, 555, 1, 4, 29, 80, 0}; // 10 elements
        System.out.println("Not sorted array: " + Arrays.toString(myArray));

        int[] expected = {0, 1, 4, 6, 29, 76, 80, 243, 555, 800};
        int[] actual = sortBubble.bubbleSortArray(myArray);
        System.out.println("Sorted array: " + Arrays.toString(actual));
        System.out.println("----------------------------------------");

        assertArrayEquals(expected, actual);
    }

    @Test
    void secondBubbleSortArrayTest() {

        SortBubble sortBubble = new SortBubble();
        int[] myArray = {1, 23, 19, 76, 115, 54, 7, 18, 66, 4}; // 10 elements
        System.out.println("Not sorted array: " + Arrays.toString(myArray));

        int[] expected = {1, 4, 7, 18, 19, 23, 54, 66, 76, 115};
        int[] actual = sortBubble.bubbleSortArray(myArray);
        System.out.println("Sorted array: " + Arrays.toString(actual));
        System.out.println("----------------------------------------");

        assertArrayEquals(expected, actual);
    }
}

