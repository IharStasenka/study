package com.training.istasenka;

public class SortingContext {

    Sorter sortStrategy;
    SortingContext(Sorter sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    void execute(int[] inputArray) {
        sortStrategy.sort(inputArray);
    }

}
