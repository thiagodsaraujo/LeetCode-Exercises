package Easy.PalindromeNumber;

public class OtherSolutionPalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(121);
    }


    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int reverse = 0;
        while (reverse < x) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        /**
         * If input number has even number of digits then check `x == reverse`.
         *
         * If input number has odd number of digits then check `x == reverse / 10`. This
         * is because, reverse will have one extra digit. Middle digit of original
         * number will be least significant digit of reverse.
         */
        return reverse == x || reverse / 10 == x;
    }
}

