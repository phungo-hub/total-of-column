import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
        };

        int givenColumn;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter column number: ");
            givenColumn = scanner.nextInt();
            if (givenColumn < 0 || givenColumn >= matrix[0].length)
                System.out.println("Column is out of range. Please re-input");
        } while (givenColumn < 0 || givenColumn >= matrix[0].length);


        for (int column = 0; column < matrix[0].length; column++) {
            double total = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (column == givenColumn)
                    total += matrix[row][column];
            }

            if (total != 0) {
                System.out.print("The total of column " + givenColumn + " is: " + total);
                break;
            }
        }
    }
}