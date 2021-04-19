package com.training.istasenka;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSorterTest {

    @Test
    public void sortTest() {

        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] inputArray = new int[]{3, 2, 9, 4, 8, 2};
        int[] expected = new int[]{2, 2, 3, 4, 8, 9};
        bubbleSorter.sort(inputArray);
        assertArrayEquals(expected, inputArray);

    }
}