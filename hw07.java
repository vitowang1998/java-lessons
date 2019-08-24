import java.util.*;
import java.util.Scanner;

public class hw07 {

    // Write a program to request an integer from 1 to 9 and print a line of output consisting 
    //   of ascending digits from 1 to n followed by descending digits from n to 1. 
    // E.g. If n is 5 then your program should print:
    // 12345 54321
    static void hw0705() { // parameter

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 1 || n > 9) {
            System.out.println("INCORRECT INPUT: Number has to be between 1 to 9.");
            // exit(0) means that there's no problem in the program
            System.exit(1);
        }

        

        // For iterators, use ++i other than i++
        // Safer and faster when i is an object
        // Copy constrcutor (2nd/3rd university level)
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < (n / 2 + 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Write a program that request a set of numbers from the user and determine and print 
    //   all the prime numbers entered by the user. The program should be terminated with the 
    //   entry of a sentinel value of 999. 
    // Sample in: 1 3 9 11 13
    // Sample out: 3 11 13
    static void hw0706() {
        Vector primeNumbers = new Vector();
        Scanner in = new Scanner(System.in);

        


        while (true) {
            int num = in.nextInt();
            System.out.println(num);
        }
    }


    public static void main(String[] args) {
        System.out.println("hello, world!");
        hw0705();
        // hw0706();
    }
}
