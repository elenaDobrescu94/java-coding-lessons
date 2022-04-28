package com.coding.lesson2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingElementTest {

    MissingElement missingElement = new MissingElement();

    @Test
    public void solutionTest1() {
        int A[] = new int[]{3,5,1,2};
        assertEquals(4, missingElement.solution(A));
    }

    @Test
    public void solutionTest2() {
        int A[] = new int[]{3,4,5,1,2};
        assertEquals(6, missingElement.solution(A));
    }

    @Test
    public void solutionTest3() {
        int A[] = new int[100000];
        for(int i = 0; i< 99999;i++){
            A[i] = i;
        }
        assertEquals(99999, missingElement.solution(A));
    }
}