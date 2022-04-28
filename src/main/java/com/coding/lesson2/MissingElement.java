package com.coding.lesson2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 public int solution(int[] A);
 *
 * that, given an array A, returns the value of the MISSING element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
public class MissingElement {

    public int solution(int[] A) {
        /** Solution one
        List<Integer> fullArrayList = IntStream.rangeClosed(1, A.length+1)
                .boxed().sorted().collect(Collectors.toList());
        List<Integer> listA = Arrays.stream(A).boxed().sorted().collect(Collectors.toList());

        fullArrayList.removeAll(listA);
        return fullArrayList.get(0);
         */
        //Solution Thomas
        /**
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sumAllElements=0;


        for(int i = 0 ; i < A.length; i++) {
            if(A[i] < min) {
                min = A[i];
            }
            if(A[i] > max) {
                max = A[i];
            }
            sum = sum + A[i];
        }

        for(int i = min; i <= max; i++) {
            sumAllElements = sumAllElements + i;
        }

        return sumAllElements - sum;
         */

        //Diana
        /**
        int actualSum = 0;

        for (int element: A) {
            actualSum = actualSum + element;
        }

        int expectedArrayLength = A.length + 1;
        int expectedSum = expectedArrayLength * (expectedArrayLength + 1) / 2;

        return expectedSum - actualSum;
         */

        //Vlad
        if (A.length == 0)
            return 1;
        //Todo - implementation
        Map<Integer, Integer> positions = new HashMap<>();
        for(int i = 1; i < A.length + 2; i ++){
            positions.put(i, -1);
        }
        for(int i = 0; i < A.length; i ++){
            positions.put(A[i],i);
        }
        for(int i = 1; i <= A.length + 1; i ++){
            if(positions.get(i) == -1)
                return i;
        }
        return -1;



        //Sebi
        /**
        byte[] B = new byte[A.length+3];
        for (int i : A) {
            B[i-1] = 1;

        }

        for (int i = 0; i < B.length-1; i++) {
            if(B[i] == 0) return i+1;
        }

        return -1;
         */


    }


}
