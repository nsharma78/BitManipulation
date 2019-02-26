/*
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */

package main.java;

public class SingleNumberVersion2 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,2,3,4,5,6,7,1,2,3,4,5,6};
        System.out.println("Result: " + findSingle(arr));
    }

    private static int findSingle(int[] A) {
        if (A == null || A.length == 0)
            return Integer.MIN_VALUE;

        int ones = 0, twos = 0, threes = 0;
        for (int i = 0; i < A.length; i++) {
            twos = twos | ones & A[i];
            ones = ones ^ A[i];
            threes = ones & twos;
            ones = ones & ~threes;
            twos = twos & ~threes;
        }
        return ones;
    }
}
