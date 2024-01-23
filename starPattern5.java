 class TrianglePattern {
    public static void main(String[] args) {
        int numRows = 5; // You can change this value to set the number of rows

        // Printing the triangle pattern
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
 
    

