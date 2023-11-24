package Easy.PalindromeNumber;

public class OtherSolutionYtPalindrome {

    public static void main(String[] args) {
        var i = 121;
        isPalindrome(i);

    }

    public static boolean isPalindrome(int x) {
        // Palindromo não pode ser negativo
        // Tem que ser diferente de 0 e o resto da divisão por 10 tem que ser diferente de 0

        /**
         * x = 1221 e r = 0
         * r = 0 * 10 + 1221 % 10 = 1
         * x = 1221 / 10 = 122
         * próximo laço
         * x = 122
         * r = 1 * 10 + 122 % 10 = 12
         * x = 122/10 = 12
         * --
         * x = 12 e r 12 e entra no return( nesse caso da erro por ser numero par, no algoritmo)
         * o que importa é o primeiro e o ultimo numero serem iguais como 121
         */
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int r = 0;

        while (x > r){
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r == x || r / 10 == x;
    }
}


