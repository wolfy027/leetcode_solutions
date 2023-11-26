package leetcode_solutions.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

        // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 7, 11, 15 };

        TwoSum1 obj = new TwoSum1();
        System.out.println(Arrays.toString(obj.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(TwoSum1.findTwoSum(nums1,9)));
    }
}
