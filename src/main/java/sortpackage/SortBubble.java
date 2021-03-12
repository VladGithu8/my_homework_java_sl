package sortpackage;

public class SortBubble {

    public int[] bubbleSortArray(int[] myArray) {
        // Big O(N)
        boolean notSorted = false;
        while (!notSorted) {
            notSorted = true;
            for (int i = 1; i < myArray.length; i++) {
                if (myArray[i] < myArray[i - 1]) {
                    int temporaryVariable = myArray[i];
                    myArray[i] = myArray[i - 1];
                    myArray[i - 1] = temporaryVariable;
                    notSorted = false;
                }
            }
        }
        return myArray;
    }
}


