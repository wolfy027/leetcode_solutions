package leetcode_solutions._150;

import java.util.Arrays;

public class RemoveElement27 {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };

        RemoveElement27 obj = new RemoveElement27();
        System.out.println(obj.removeElement(nums, 3));
    }
}
