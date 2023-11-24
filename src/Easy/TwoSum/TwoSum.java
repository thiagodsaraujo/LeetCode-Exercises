package Easy.TwoSum;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    //minha solução, força bruta
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 1};
        printar(twoSum(nums, 11));
    }

    private static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        var size = nums.length;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void printar(int[] nums){
        for (int num: nums
        ) {
            System.out.printf("%d ", num);
        }
    }

    /**
     *
     * Na tabela abaixo alguns especificadores de formato
     *
     * %d	representa números inteiros
     * %f	representa números floats
     * %2f	representa números doubles
     * %b	representa valores booleanos
     * %c	representa valores char
     * %s   representa valores String
     */
}

