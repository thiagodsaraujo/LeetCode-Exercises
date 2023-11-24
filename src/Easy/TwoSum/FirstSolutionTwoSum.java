package Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

/*
https://www.youtube.com/watch?v=KLlXCFG5TnA&list=PLot-Xpze53ldVwtstag2TL4HQhAnC8ATf&ab_channel=NeetCode

MÉTODO DA FORÇA BRUTA:

A SOLUÇÃO ADEQUADA PARA A SOLUÇÃO DESSE PROBLEMA É PEGAR O PRIMEIRO INDICE DO ARRAY E VARRER OS PRÓXIMOS INDICES
E VERIFICAR SE A SOMA BATE COM O TARGET, SE ACABAR O ARRAY PASSA PARA O PRÓXIMO E FAZ NOVAMENTE A OPERAÇÃO ATÉ ACHAR
OS PARES QUE BATEM A SOMA COM O TARGET
NÃO FAREMOS COM O ANTERIOR PQ ELE JA FOI TESTADO NO PRIMEIRO LAÇO

O(N²) - Time Complexity - Worst Case Complexity

MÉTODO COM HASHMAP(mais eficiente)

hashmap(value:index)
[2,1,5,3] -> TARGET = 4
HASHMAP
VALUE:INDEX
2       0
1       1
5       2
3       3

Usando hash basicamente iremos fazer o seguinte
Pegaremos o nº 1 e diminuiremos do target => 1 - 4 = 3 -> unico valor que se somado bate o target
Verificamos se existe 3 no array.
nao pode usar o mesmo valor e mesmo indice par fazer a verificação
Tim
 */
public class FirstSolutionTwoSum {

    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50, 60, 70, 80, 1};
        printar(twoSum(nums, 70));

    }

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        int[] result= new int[2]; // array de tamanho 02, a soma dos numeros tem só duas posições

        for(int i = 0; i < n; i++){

            // 9 - 2 = 7 -> Se contem o 7, subtrai o primeiro item do array do valor desejado
            if(map.containsKey(target - nums[i])){ // verifica se no mapa, contem o valor que ta procurando.
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }

            map.put(nums[i],i);
        }

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }

        return result;
    }

    public static void printar(int[] nums){

        for (int num: nums) {

            System.out.print(num + ", ");

        }
    }
}
