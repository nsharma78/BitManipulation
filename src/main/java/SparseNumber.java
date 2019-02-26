/*
 * A number is Sparse if there are no two adjacent 1s in its binary representation.
 * For example 5 (binary representation: 101) is sparse, but 6 (binary representation: 110) is not sparse.
 */

package main.java;

public class SparseNumber {
    public static void main(String[] args) {
        int num = 6;
        System.out.println("isSparse: " + isSparse(num));
    }

    private static boolean isSparse(int num) {

        int prev = num & 1;
        num = num >> 1;
        int cur = 0;
        while(num > 0) {
            cur = num & 1;
            if(prev == 1 && cur == 1)
                return false;
            num = num >> 1;
            prev = cur;
        }
        return true;
    }
}
