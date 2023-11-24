package Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {

    public static void main(String[] args) {
        int[] numbers = new int[] {2,3,7,4,8};
        int target = 6;

        int[] result = getTwoSum(numbers,target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if (visitedNumbers.containsKey(delta)){
                return  new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i); // vai pegar o valor e o indice.
        }
        return new int[] {-1,-1};
    }
}
