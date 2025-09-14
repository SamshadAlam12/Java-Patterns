import java.util.Scanner;

public class ReversedHalfPyramidWithNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // REVERSE HALF PYRAMID
        for (int i = n; i >= 1; i--) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for numbers
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line
        }
        sc.close();
    }
}
