package com.codility.training.lesson4;

import java.util.Arrays;

/**
 * Created by pdebala on 2016-07-01.
 *
 * 100% https://codility.com/demo/results/trainingGVSVWZ-C76/
 *
 */
public class PermCheck {

    public static void main(String[] arg) {
        System.out.println(solution(new int[]{4,1,3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A[0] != 1 || A.length != A[A.length-1]) {
            return 0;
        }

        int indexSum = 0;
        int valueSum = 0;

        for (int i = 0; i < A.length; i++) {
            indexSum += (i +1);
            valueSum += A[i];
            if (indexSum != valueSum)
                return 0;
        }
        return 1;
    }
}
