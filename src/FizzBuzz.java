import java.util.ArrayList;
import java.util.Iterator;

public class FizzBuzz {
    public void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void generate(int n) {
        Integer len = (int)Math.ceil(Math.sqrt(n));
        for (int i = 2; i < len; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(',');
            }
        }
    }
}
