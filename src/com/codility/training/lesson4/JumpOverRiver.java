package com.codility.training.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pdebala on 2016-07-03.
 *
 * 72%  https://codility.com/demo/results/trainingJA46V3-BU5/
 * 100% https://codility.com/demo/results/trainingQGKUS8-Z4P/
 *
 */
public class JumpOverRiver {

    public static void main(String[] args) {

    }

    public static int solution(int X, int[] A) {

        int time = -1;
        Set<Integer> positions = new HashSet<>(X);

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                if (!positions.contains(A[i])) {
                    positions.add(A[i]);
                    if (positions.size() == X) {
                        time = i;
                        break;
                    }
                }
            }
        }
        return time;
    }
}
