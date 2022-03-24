package com.lwyang.array;

import java.util.Arrays;

/**
 * @author yangliwei
 */

public class SquaresOfSortedArray_977 {

    public static void main(String[] args) {
        int[] testcase = new int[]{-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares1(testcase)));
    }

    static int[] sortedSquares1(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j; ) {

            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                i++;
            } else {
                ans[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return ans;
    }

        static int[] sortedSquares ( int[] nums){
            int[] ans = new int[nums.length];

            int j = 0;
            int k = nums.length - 1;
            int pos = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (j < nums.length && k < nums.length && pos >= 0) {
                    if (nums[j] * nums[j] > nums[k] * nums[k]) {
                        ans[pos] = nums[j] * nums[j];
                        j++;
                    } else {
                        ans[pos] = nums[k] * nums[k];
                        k--;
                    }
                    pos--;
                }
            }
            return ans;
        }
    }
