package com.coding.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingElementTest {

    MissingElement missingElement = new MissingElement();

    @Test
    void solutionTest1() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }
    //Todo - more 6 tests
}