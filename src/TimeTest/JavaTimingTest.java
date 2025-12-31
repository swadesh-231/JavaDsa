package TimeTest;

import java.math.BigInteger;

public class JavaTimingTest {

    public static void main(String[] args) {

        BigInteger N = new BigInteger("1000000000000000000000000000000000000");


        long start = System.nanoTime();

        long sum = 0;
        for (long i = 1; i <= N.bitLength(); i++) {
            sum += i * i;
        }

        long end = System.nanoTime();

        System.out.println("Sum: " + sum);
        System.out.println("Time (ms): " + (end - start) / 1_000_000);
    }
}
