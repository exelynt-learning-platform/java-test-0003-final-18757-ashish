/**
 * Program to print a binary triangle pattern using nested loops.
 * 
 * Pattern:
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 0 1 0 1 0 1
 */
public class assignment03 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // If sum of row index and column index is even, print 1, else 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                
                // Add space between elements in the same row
                if (j < i) {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
