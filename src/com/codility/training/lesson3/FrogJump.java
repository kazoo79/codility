package com.codility.training.lesson3;

/**
 * Created by pdebala on 2016-07-01.
 *
 * 100% https://codility.com/demo/results/trainingGZRJ7E-EFG/
 *
 */
public class FrogJump {

    public static void main(String[] args) {
        System.out.print(solution(1, 2, 30));
    }

    public static int solution(int X, int Y, int D) {
        int dist = Y - X;
        if (dist == 0)
            return dist;

        int jumps = dist / D;
        if (dist % D != 0)
            jumps += 1;
        return jumps;
    }
}
