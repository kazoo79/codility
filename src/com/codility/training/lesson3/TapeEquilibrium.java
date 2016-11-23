package com.codility.training.lesson3;

import static java.lang.Math.abs;

/**
 * Created by pdebala on 2016-07-01.
 *
 * 100% https://codility.com/demo/results/trainingS2RKBA-VNB/
 *
 *
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }

    public static int solution(int[] A) {
        int P = Integer.MAX_VALUE;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }

        for(int i = 1; i < A.length; i++) {

            leftSum = leftSum + A[i-1];
            rightSum = rightSum - A[i-1];

            P = Math.min(P, (abs(leftSum-rightSum)));
            if (P == 0) {
                break;
            }
        }
        return P;
    }
}
