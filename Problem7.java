import java.util.*;

public class Problem7 {

    public static List<Integer> primes;

    public static boolean isPrime(int n) {
        for (int prime : primes) {
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);

        int n = 5;

        while (true) {
            if (isPrime(n)) {
                primes.add(n);
                if (primes.size() == 10001) {
                    System.out.println(primes.get(primes.size()-1));
                    break;
                } 
            }
            n += 2;
        }
    }
}