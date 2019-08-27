import java.util.Scanner;

public class HW08 {

    static void solutionForQ2() {
        Scanner reader = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int a = reader.nextInt();
            numbers[i] = a;
            sum += a;
        }

        System.out.println("Out put the array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Sum: " + Integer.toString(sum));
    }

    public static void main(String[] args) {
        solutionForQ2();
    }
}