package com.codility.training.lesson4;

import java.util.Arrays;
/**
 * Created by pdebala on 2016-07-03.
 *
 * 66% https://codility.com/demo/results/trainingJ8V85U-6JU/
 */
public class MissingInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 2, 3}));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);
        int missing = A[A.length-1] + 1;
        int index = Arrays.binarySearch(A, 1);

        System.out.println("index: " + index);

        if (index < 0)
            missing = 1;
        else
            for (int i = index; i < A.length-1; i++) {
                if (A[i] + 1 != A[i+1]) {
                    missing = A[i] + 1;
                }
            }
        return missing;
    }
}
