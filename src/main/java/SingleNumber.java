/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

package main.java;

public class SingleNumber {

    public static void main(String[] args) {
        int arr[] = {12, 1, 14, 3, 10, 12, 1, 2, 2, 3, 14};
        System.out.println("Result: " + findSingle(arr));
    }

    private static int findSingle(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MIN_VALUE;

        int result = 0;
        for(int i : arr)
            result = result ^ i;

        return result;
    }
}
