public class Problem1 {

    /**
     * Returns the sum of all multiples of 3 and 5 between 0 and n.
     * n must be non-negative
     */
    public static int multiplesOf3And5(int n) { 
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multiplesOf3And5(1000));
    }
}