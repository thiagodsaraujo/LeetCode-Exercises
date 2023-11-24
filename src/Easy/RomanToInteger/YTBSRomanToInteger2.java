package Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class YTBSRomanToInteger2 {

    //https://www.youtube.com/watch?v=dlATMslQ6Uc&ab_channel=AlgorithmsMadeEasy
    // TIME: O(N)
    // SPACE: 0(1)
    public static void main(String[] args) {
        String s = "XXIV";
        System.out.println(romanToInt(s));
        System.out.println(s.length());
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

        //vai pegar o valor do ultimo digito da string
        int result = map.get(s.charAt(s.length()-1));

        //de trás pra frente
        //o i vai ser -2 porque, vai começar no antepenultimo, pq ja pegamos o valor do ultimo
        for (int i = s.length() -2 ; i >= 0; i--) {
            // if o valor de i é menor que o i + 1
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                // a string na posicao i(antecessor) é menor que o da frente ? Se sim diminui se nao aumenta
                result-= map.get(s.charAt(i));
            }else {
            result += map.get(s.charAt(i));
            }
        }
        return result;
    }


}
