package com.codility.training.lesson1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by pdebala on 2016-06-30.
 *
 * 80% https://codility.com/demo/results/training8SX5BG-PPS/
 * 100% https://codility.com/demo/results/training8E7AQ6-R4X/
 */
public class BinaryGap {

    public static void main(String[] args) {
        System.out.println("Longest gap: " + solution(20));
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        String[] gaps = binary.substring(binary.indexOf("1"), binary.lastIndexOf("1")).split("1+");
        if (gaps.length == 0)
            return 0;
        else if (gaps.length > 1)
            Arrays.sort(gaps, new StringLengthComparator());
        return gaps[0].length();
    }

    static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length())
                return 1;
            else if (s1.length() == s2.length())
                return 0;
            return -1;
        }
    }



}
