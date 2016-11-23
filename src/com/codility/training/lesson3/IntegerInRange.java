package com.codility.training.lesson3;

import java.util.Arrays;

/**
 * Created by pdebala on 2016-07-02.
 *
 * 80%  https://codility.com/demo/results/training4YUB72-Q8B/
 * 90%  https://codility.com/demo/results/training2SZ6UX-N38/
 * 100% https://codility.com/demo/results/trainingTEJAUE-4Y3/
 *
 */
public class IntegerInRange {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1, 5}));
    }

    public static int solution(int[] A) {

        int n = A.length + 1;

        Arrays.sort(A);

        if (n == 1 || A[0] != 1) {
            return 1;
        }
        if (A[A.length-1] != n) {
            return n;
        }

        int missing = A[0];
        for(int i = 0; i < A.length-1; i++) {
            if (A[i+1] - A[i] != 1) {
                missing = A[i] + 1;
                break;
            }
        }
        return missing;
    }
}
