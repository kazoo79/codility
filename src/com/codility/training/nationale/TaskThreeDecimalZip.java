package com.codility.training.nationale;

import java.util.StringTokenizer;

/**
 * Created by pdebala on 2016-07-09.
 */
public class TaskThreeDecimalZip {

    public static void main(String[] args) {
        System.out.println(solution(12345, 678));
    }

    public static int solution(int A, int B) {

        final int maxRange = 1000000000;

        int result = 0;

        if (A != 0 || B != 0) {
            if (A == 0) {
                result = B;
            } else {
                StringBuilder resultStr = new StringBuilder();
                char[] aChar = String.valueOf(A).toCharArray();
                char[] bChar = String.valueOf(B).toCharArray();
                int index = 0;
                while (index < aChar.length || index < bChar.length) {
                    if (index < aChar.length) {
                        resultStr.append(aChar[index]);
                    }
                    if (index < bChar.length) {
                        resultStr.append(bChar[index]);
                    }
                    index++;
                }
                result = Integer.valueOf(resultStr.toString());
            }

        }
        return result > maxRange ? -1 : result;
    }
}
