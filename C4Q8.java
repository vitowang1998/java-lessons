import java.util.Scanner;

public class C4Q8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // variables
        int weight1InKG;
        int weight1InG;

        int weight2InKG;
        int weight2InG;

        System.out.print("Please enter 1st weight in KG: ");
        weight1InKG = reader.nextInt();

        System.out.print("Please enter 1st weight in G: ");
        weight1InG = reader.nextInt();

        System.out.print("Please enter 2nd weight in KG: ");
        weight2InKG = reader.nextInt();

        System.out.print("Please enter 2nd weight in G: ");
        weight2InG = reader.nextInt();

        int totalWeight = weight1InKG * 1000 + weight1InG + weight2InKG * 1000 + weight2InG;
        // 8700   8  700
        int totalKG = totalWeight / 1000;
        int totalG = totalWeight % 1000;

        System.out.println("The total weight is of: " + totalKG + " kg, and " + totalG + " g.");

    }
}