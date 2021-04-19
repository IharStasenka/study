package com.training.istasenka;

import org.junit.Test;

import static org.junit.Assert.*;

public class MockNotaSorterTest {

    @Test
    public void sortTest() {
        MockNotaSorter mockNotaSorter = new MockNotaSorter();
        int[] inputArray = new int[]{3, 2, 9, 4, 8, 2};
        int[] expected = new int[]{3, 2, 9, 4, 8, 2};
        mockNotaSorter.sort(inputArray);
        assertArrayEquals(expected, inputArray);
    }
}