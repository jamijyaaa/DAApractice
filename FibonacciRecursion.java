public class FibonacciRecursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + fibonacci(5));
        System.out.println("Example 2: " + fibonacci(7));
        System.out.println("Example 3: " + fibonacci(10));
    }
}
