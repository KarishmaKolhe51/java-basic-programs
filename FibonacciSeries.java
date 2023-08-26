public class FibonacciSeries {
    public static void main1(String args[]) {
        int num1 = 0, num2 = 1, num3, count = 10;
        System.out.print(num1 + " " + num2); // printing 0 and 1

        for (int i = 2; i < count; ++i) { // loop starts from 2 because 0 and 1 are already printed
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    static void Fibonacci(int N) { // time complexity is O(N)
        int num1 = 0, num2 = 1, counter = 0;

        while (counter < N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    public static void main(String args[]) {
        int N = 18;
        Fibonacci(N);
    }
}
