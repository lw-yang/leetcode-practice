package com.lwyang.array;

/**
 * @author yangliwei
 */

public class RemoveElement_27 {

    public static void main(String[] args) {

    }

    static int removeElement(int[] nums, int val) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] == val) {
                j++;
            } else {
                j++;
                k++;
            }

            if (k != j && k<nums.length && j< nums.length) {
                nums[k] = nums[j];
            }
        }
        return k;
    }

}
