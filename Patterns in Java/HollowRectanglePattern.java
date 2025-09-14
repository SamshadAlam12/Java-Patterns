public class HollowRectanglePattern {
    public static void Hollow_Rectangle(int row, int col) {
        // Outer loop for rows
        for (int i = 1; i <= row; i++) {
            // Inner loop for columns
            for (int j = 1; j <= col; j++) {
                // Print stars for the border and spaces for the inside
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* "); // Keep space after * for uniformity
                } else {
                    System.out.print("  "); // Two spaces to match star+space
                }
            }
            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(6, 8); // 6 rows, 8 columns
    }
}

