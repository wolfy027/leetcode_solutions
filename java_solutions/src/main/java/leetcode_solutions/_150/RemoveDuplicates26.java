package leetcode_solutions._150;

import java.util.Arrays;

public class RemoveDuplicates26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        RemoveDuplicates26 obj = new RemoveDuplicates26();
        System.out.println(obj.removeDuplicates(nums));
    }
}
