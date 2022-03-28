package com.lwyang.array;

/**
 * @author yangliwei
 */

public class MinimumSizeSubarraySum_209 {

    public static void main(String[] args) {
//        int[] testcase = new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int[] testcase = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, testcase));
    }

    static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int windowSum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (windowSum < target) {
                windowSum += nums[i];
            }
            while (windowSum >= target) {
                result = Math.min(result, i - j + 1);
                windowSum -= nums[j];
                j++;
            }
        }


        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
