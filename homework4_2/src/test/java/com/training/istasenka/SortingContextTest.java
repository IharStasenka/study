package com.training.istasenka;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingContextTest {

    int[] inputArray = new int[]{3, 2, 9, 4, 8, 2};

    @Test
    public void executeMockNotaSorterTest() {
        Sorter sorterStrategy = new MockNotaSorter();
        SortingContext sortingContext = new SortingContext(sorterStrategy);
        int[] expected = new int[]{3, 2, 9, 4, 8, 2};
        sortingContext.execute(inputArray);
        assertArrayEquals(expected, inputArray);
    }

    @Test
    public void executeInsertionSorterTest() {
        Sorter sorterStrategy = new InsertionSorter();
        SortingContext sortingContext = new SortingContext(sorterStrategy);
        int[] expected = new int[]{2, 2, 3, 4, 8, 9};
        sortingContext.execute(inputArray);
        assertArrayEquals(expected, inputArray);
    }
}