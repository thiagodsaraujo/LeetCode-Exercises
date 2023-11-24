package Easy.PalindromeNumber;

public class SolutionPalindromeNumber {

    //https://pythontutor.com/visualize.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20isPalindrome%28121%29%3B%0A%20%20%20%20%7D%0A%20%20%20%20%0A%20%20%20%20public%20static%20boolean%20isPalindrome%28int%20x%29%20%7B%0A%20%20%20%20int%20sum%20%3D%200,target%20%3D%20x%3B%0A%20%20%20%20while%20%28x%20%3E%200%29%20%7B%0A%20%20%20%20%20%20%20%20int%20temp%20%3D%20x%20%25%2010%3B%0A%20%20%20%20%20%20%20%20x%20/%3D%2010%3B%0A%20%20%20%20%20%20%20%20sum%20%3D%20sum%20*%2010%20%2B%20temp%3B%0A%20%20%20%20%7D%0A%20%20%20%20return%20sum%20%3D%3D%20target%3B%0A%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        int sum = 0,target = x;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
    }

}
