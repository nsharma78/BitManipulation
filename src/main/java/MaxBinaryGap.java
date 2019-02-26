/*
 * Problem: Get maximum binary Gap between two 1s
 * For example, 9's binary form is 1001, the gap is 2.
 */

package main.java;

public class MaxBinaryGap {

    public static void main(String[] args) {
        int num = 9;
        System.out.println("Max binary gap is: " + maxBinaryGap(num));
    }

    private static int maxBinaryGap(int num) {
        int max = 0;
        int count = -1;
        int r = 0;

        while (num > 0) {
            // get right most bit & shift right
            r = num & 1;
            num = num >> 1;

            if (0 == r && count >= 0) {
                count++;
            }

            if (1 == r) {
                max = count > max ? count : max;
                count = 0;
            }
        }

        return max;
    }
}
