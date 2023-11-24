package Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class YTBSRomanToInteger {

    //https://www.youtube.com/watch?v=hEhf_oz3wsM&list=TLPQMjYxMTIwMjKHrJFr7m8KVQ&index=1&ab_channel=JavaBrains
    public static void main(String[] args) {
        String s = "CIV";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                    result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }

            else {
            result += map.get(s.charAt(i));
            }
        }
        return result;
    }


}
