package com.training.istasenka;

public class BubbleSorter implements Sorter {
    @Override
    public void sort(int[] inputArray) {
        for (int i = 0; i <= inputArray.length - 1; i++) {
            for (int j = 0; j <= inputArray.length - i - 2; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int mock = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = mock;
                }
            }
        }
    }
}
