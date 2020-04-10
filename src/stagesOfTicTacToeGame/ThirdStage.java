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

    }
}
