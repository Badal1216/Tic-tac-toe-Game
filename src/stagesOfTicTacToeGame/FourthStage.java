package stagesOfTicTacToeGame;

import java.util.Scanner;

public class FourthStage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
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

    }
}
