/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 */

package main.java;

public class SetBits {

    public static void main(String[] args) {
        int num = 15;
        System.out.println("Count of set bits: " + hammingWeight(num));
    }

    private static int hammingWeight(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) == 1)
                count++;
            num = num >> 1;
        }

        return count;
    }
}
