import java.util.*;

public class Problem2 {

    /**
     * Calculate the sum of all even fibonacci numbers <= maxVal
     * 
     * maxVal must be > 1
     */
    public static int sumEvenFibs(int maxVal) {
        if (maxVal <= 1) throw new IllegalArgumentException("maxVal must be > 1");

        List<Integer> fibs = new ArrayList<Integer>();

        // seed some initial values
        fibs.add(1);
        fibs.add(2);

        // calculate fibonacci numbers until we hit the limit
        int nextVal = 3;
        while (nextVal <= maxVal) {
            nextVal = fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2);
            fibs.add(nextVal);
        }

        // sum even fibonacci numbers
        int sum = 0;
        for (Integer i : fibs) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenFibs(4000000));
    }
}