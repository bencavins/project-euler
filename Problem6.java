public class Problem6 {
    public static void main(String[] args) {
        int sum1 = 0;

        for (int i = 1; i <= 100; i++) {
            sum1 += (i*i);
        }

        System.out.println(sum1);

        int sum2 = 0;

        for (int i = 1; i <= 100; i++) {
            sum2 += i;
        }

        System.out.println(sum2*sum2);

        System.out.println((sum2*sum2)-sum1);
    }
}