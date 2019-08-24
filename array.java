// Array is series of data
// It can be a series of integers, characters, etc.

public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple", "peach", "orange"};

        System.out.println("The length of the array is: " + fruits.length);

        for (int i = 1; i <= fruits.length; i++) {
            System.out.println(i + ": " + fruits[i - 1]);
        }

    }
}