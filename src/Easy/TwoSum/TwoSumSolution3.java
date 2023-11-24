package Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution3 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
    System.out.println(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] output = new int[2];

        // 9 - 2 = 7

        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])){
                output[0] = map.get(nums[i]);
                output[1] = i;
                return output;
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
