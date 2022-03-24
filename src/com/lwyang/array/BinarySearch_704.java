package com.lwyang.array;

/**
 * @author yangliwei
 */

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] testcase = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(testcase, target));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}


