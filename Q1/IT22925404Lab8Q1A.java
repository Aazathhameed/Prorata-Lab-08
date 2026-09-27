import java.util.Scanner;

public class IT22925404Lab8Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}