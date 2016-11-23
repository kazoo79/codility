package com.codility.training.nationale;

/**
 * Created by pdebala on 2016-07-09.
 */
public class TaskTwoSwapDescending {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 4, 4, 5, 5, 1, 1}));
    }

    public static boolean solution(int[] A) {

        int greaterIdx = 0;
        int toSwapLeft = 1;
        int toSwapRight = 0;
        boolean exists = true;

        for (int i = 1; i < A.length; i++) {
            if (A[greaterIdx] < A[i]) {
                toSwapLeft = 1;
                greaterIdx = i;
            } else if (A[greaterIdx] == A[i]) {
                toSwapLeft++;
            } else if (A[greaterIdx] > A[i]) {
                toSwapRight++;
                if (toSwapLeft > 1 && toSwapRight > 1) {
                    exists = false;
                    break;
                }
            }
        }
        return exists;
    }
}
