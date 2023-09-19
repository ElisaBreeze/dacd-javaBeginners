public class HundredthPrime {
    public static void main(String[] args) {
        /* Make a code that displays the 100th prime number */
        int count = 0;
        int n = 2;
        while (count < 100) {
            int divs = 0;

            for (int num = 1; num <= n; num++) {
                if (n % num == 0) {
                    divs++;
                }
            }
            if (divs == 2) {
                count++;
            }
            if (count == 100) {
                System.out.println(n);
            }
            n++;
        }
    }
}