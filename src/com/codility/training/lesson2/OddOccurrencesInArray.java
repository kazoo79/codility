package com.codility.training.lesson2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by pdebala on 2016-07-01.
 *
 * 100%  https://codility.com/demo/results/trainingKFVX22-GEQ/
 *
 */
public class OddOccurrencesInArray {


    public static void main(String[] args) {
        System.out.print(solution(new int[]{9,3,9,3,9,7,9}));
    }

    public static int solution(int[] A) {

        Integer current;
        Set<Integer> set = new HashSet<Integer>(A.length);
        for(int i = 0; i < A.length; i++) {
            current = Integer.valueOf(A[i]);
            if (set.contains(current)) {
                set.remove(current);
            } else {
                set.add(current);
            }
        }
        return set.iterator().next().intValue();
    }
}
