package searchpackage;

public class BinarySearch {

    public int searchMyElement(int[] sortedArray, int element) {
        // Big O(N)
        boolean mySearch = true;
        int start = 0;
        int end = sortedArray.length - 1;

        while (mySearch) {
            int mid = (start + end) / 2;
            if (sortedArray[mid] == element) {
                mySearch = false;
            } else {
                if (sortedArray[mid] < element) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
