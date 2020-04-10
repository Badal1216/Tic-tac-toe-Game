package stagesOfTicTacToeGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthStage {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = scanner.next().toUpperCase().toCharArray();
        System.out.println("---------");
        char[][] newCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (newCells[i][j] == '_') {
                    newCells[i][j] = ' ';
                }
                System.out.print(newCells[i][j] + " ");
            }
            if (i != 2) {
                System.out.print("|\n| ");
            } else {
                System.out.println("|");
            }
        }
        System.out.println("---------");

        while (true) {
            System.out.print("Enter the coordinates: ");
            int row = 0;
            int column = 0;
            int indexRow = 0;
            int indexColumn = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    row = scanner.nextInt();
                    column = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                    System.out.print("Enter the coordinates: ");
                    scanner.nextLine();
                }
            }

        }

    }
}
