package mymathematics;

// Class containing the methods for mathematical operations
public class MyIntegerMath {

    // Method to calculate the factorial of a number
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong number
    public boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        // Calculate sum of factorials of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        // Return true if sum of factorials equals the original number
        return sum == number;
    }
}

