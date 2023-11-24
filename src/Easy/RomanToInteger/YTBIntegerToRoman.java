package Easy.RomanToInteger;

public class YTBIntegerToRoman {

    //https://www.youtube.com/watch?v=JyLrPSJNfYw&list=TLPQMjYxMTIwMjKHrJFr7m8KVQ&index=3&ab_channel=JavaBrains
    //Outro vídeo
    public static void main(String[] args) {
        int num = 220;
        System.out.println(romanToInt(num));
    }

    private static String romanToInt(int num) {
        String[] units =
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens =
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds =
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"};
        String[] thousands =
                new String[]{"", "M", "MM", "MMM"};

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];

    }
}
