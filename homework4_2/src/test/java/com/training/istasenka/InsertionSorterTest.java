package com.training.istasenka;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSorterTest {

    @Test
    public void sortTest() {

        InsertionSorter insertionSorter = new InsertionSorter();
        int[] inputArray = new int[]{3, 2, 1, 4, 8, 2};
        int[] expected = new int[]{1, 2, 2, 3, 4, 8};
        insertionSorter.sort(inputArray);
        assertArrayEquals(expected, inputArray);

    }
}