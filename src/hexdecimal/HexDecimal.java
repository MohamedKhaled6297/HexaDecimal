package hexdecimal;

public class HexDecimal {

    public static void main(String[] args) {
        String s = "AB8CD";
        int decimal = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
            decimal += getDecimalChar2(s.charAt(j)) * (int) (Math.pow(16, i));
        }
        System.out.println(decimal);
        
        
    }

    public static int getDecimalChar(char ch) {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int getDecimalChar2(char ch) {

        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a' && ch <= 'f') {
            return 10 + ch - 'a';
        } else // 0 .... 9
        {
            return ch - '0';
        }
    }
}
