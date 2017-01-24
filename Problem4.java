public class Problem4 {

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();

        if (length == 0 || length == 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(length-1)) {
                return isPalindrome(s.substring(1, length-1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int maxValue = 0;

        for (int x = 999; x >= 100; x--) {
            for (int y = x; y >= 100; y--) {
                if (isPalindrome(x*y)) {
                    if (x*y > maxValue) {
                        maxValue = x*y;
                    }
                }
            }
        }

        System.out.println(maxValue);
    }
}