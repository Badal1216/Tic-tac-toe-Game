package stagesOfTicTacToeGame;

import java.util.Scanner;

public class SecondStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells:");
        String cells = scanner.next();
        System.out.println("---------");
        System.out.println("| " + cells.charAt(0) + " " + cells.charAt(1) + " " + cells.charAt(2) + " |");
    }
}
