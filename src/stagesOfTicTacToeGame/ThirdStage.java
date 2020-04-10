package stagesOfTicTacToeGame;

import java.util.Scanner;

public class ThirdStage {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        char index = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
        System.out.println("---------");
        char[][] newCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(newCells[i][j] + " ");
                if (newCells[i][0] == newCells[i][1] && newCells[i][1] == newCells[i][2]) {
                    count1 += 1;
                    if (count1 == 3) {
                        index = newCells[i][0];
                    }
                } else if (newCells[0][i] == newCells[1][i] && newCells[1][i] == newCells[2][i]) {
                    count2 += 1;
                    if (count2 == 3) {
                        index = newCells[0][i];
                    }
                }
            }
            if (i != 2) {
                System.out.print("|\n| ");
            } else {
                System.out.println("|");
            }
        }

    }
}
