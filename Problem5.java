public class Problem5 {

    public static boolean isDivisibleByRange(int n, int min, int max) {
        for (int i = min; i <= max; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 22;

        while (true) {
            if (isDivisibleByRange(n, 1, 20)) {
                System.out.println(n);
                break;
            }
            n += 2;
        }
    }
}