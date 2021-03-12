package sortpackage;

public class MergeSort {
    // Big O(N)
    int[] array;
    int[] temporaryArray;

    public void prepare(int[] arr) {
        this.array = arr;
        this.temporaryArray = new int[arr.length];
        doMergeSort(0, arr.length - 1);
    }

    public void doMergeSort(int firstIndex, int lastIndex) {

        if (firstIndex < lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            doMergeSort(firstIndex, middleIndex);
            doMergeSort(middleIndex + 1, lastIndex);
            MergePart(firstIndex, middleIndex, lastIndex);
        }
    }

    public void MergePart(int firstIndex, int middleIndex, int lastIndex) {

        if (lastIndex + 1 - firstIndex >= 0)
            System.arraycopy(array, firstIndex,
                    temporaryArray, firstIndex,
                    lastIndex + 1 - firstIndex);
        int i = firstIndex;
        int j = middleIndex + 1;
        int k = firstIndex;

        while (i <= middleIndex && j <= lastIndex) {
            if (temporaryArray[i] <= temporaryArray[j]) {
                array[k] = temporaryArray[i];
                i++;
            } else {
                array[k] = temporaryArray[j];
                j++;
            }
            k++;
        }
        while (i <= middleIndex) {
            array[k] = temporaryArray[i];
            k++;
            i++;
        }
    }
}


