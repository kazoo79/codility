package com.codility.training.nationale;

/**
 * Created by pdebala on 2016-07-09.
 */
public class TaskOneLinkedList {

    public static void main(String[] args) {
        System.out.print(solution(new int[]{0, -1}));
    }

    public static int solution(int[] A) {

        int k = 0;
        int length = 0;

        while (length++ < A.length) {
            if (A[k] != -1) {
                k = A[k];
            } else {
                break;
            }
        }
        return length;
    }
}
