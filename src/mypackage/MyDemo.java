package mypackage;

import mymathematics.MyIntegerMath;

// Class containing the main method for testing
public class MyDemo {

    public static void main(String[] args) {
        MyIntegerMath math = new MyIntegerMath();

        int number = 145; // You can change this to any number you want to test
        boolean result = math.isStrong(number);

        if (result) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}
