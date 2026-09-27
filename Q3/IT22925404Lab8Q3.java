import java.util.Scanner;

public class IT22925404Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = scanner.nextInt();

            if (num > 0) {
                arr[i] = num;
                i++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        System.out.println("\nArray Contents:");
        for (int j = 0; j < 6; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        int max = arr[0];
        for (int j = 1; j < 6; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);
        scanner.close();
    }
}