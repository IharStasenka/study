package com.training.istasenka;

public class InsertionSorter implements Sorter {
    @Override
    public void sort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int base = inputArray[i];
            int j = i - 1;
            while ((j >= 0) && (inputArray[j] >= base)) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = base;
        }
    }
}
