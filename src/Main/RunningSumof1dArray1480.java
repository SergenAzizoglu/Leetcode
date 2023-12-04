package Main;

import java.util.Arrays;

public class RunningSumof1dArray1480 {


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

        Solution.runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }

}

class Solution{
    public static int[] runningSum(int[] nums) {

        for(int i = 1;i<nums.length;i++){
             nums[i] += nums[i-1];
        }

        return nums;

    }
}
