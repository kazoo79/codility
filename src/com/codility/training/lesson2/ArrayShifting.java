package com.codility.training.lesson2;

import java.util.*;

/**
 * Created by pdebala on 2016-07-01.
 *
 * 100%  CyclicRotation https://codility.com/demo/results/trainingV6DAMY-8PW/
 *
 */
public class ArrayShifting {

    public static void main(String[] args) {
       int[] A = solution(new int[] {3, 8, 9, 7, 6}, 3);
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    public static int[] solution(int[] A, int K) {
        if (K == 0 || A.length < 2)
            return A;

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < A.length; i++) {
            list.add(Integer.valueOf(A[i]));
        }

        while (K-- > 0) {
            list.addFirst(list.getLast());
            list.removeLast();
        }
        int[] B = new int[A.length];
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            B[i] = it.next().intValue();
        }
        return B;
    }
}
