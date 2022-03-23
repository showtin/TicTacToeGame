import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class TicTacToe {
    public static Map<Integer, Character> field = new HashMap<>();
    public static Character player;
    public static Character player2;
//    public static int[][] combinations = {
//            {0,1,2},
//            {2,5,8},
//            {2,4,6},
//            {6,7,8},
//            {0,3,6},
//            {0,4,8},
//            {1,4,7},
//            {3,4,5}
//    };

    public static void setGameField() {
        for (int i = 0; i < 9; i++) {
            field.put(i, '_');
        }
    }

    public static void getGameField() {
        for (int i = 0; i < field.size(); i++) {
            if (i % 3 == 0) System.out.println(" ");
            System.out.print(field.get(i));
        }
    }

    public static void printPlayerChooseMessage() {
        System.out.println("What do you choose?:");
        System.out.println("1 - X");
        System.out.println("2 - O");

    }

    public static void choosePlayer() {
        int playerChoose;
        while (player == null) {
            printPlayerChooseMessage();
            try {
                Scanner scanner = new Scanner(System.in);
                playerChoose = scanner.nextInt();
                checkPlayerChoose(playerChoose);
            } catch (InputMismatchException e) {
                System.out.println("Invalid argument, please try again");
            }

        }
    }

    public static void checkPlayerChoose(int playerChoose) {
        if (playerChoose == 1) {
            System.out.println("You will play X");
            player = 'X';
            player2 = 'O';

        }
        if (playerChoose == 2) {
            System.out.println("You will play O");
            player = 'O';
            player2 = 'X';

        }
    }
    //TODO Написать чекер для проверки победил ли игрок/проиграл и закончилась ли игра
    //TODO Доработать логику

    public static void makeMove(Character player) {
        setGameField();
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("select a number from 1 to 8");
            int playerMove = scanner.nextInt();
            field.put(playerMove, player);
            getGameField();
        }

    }


    public static void startGame() {
        choosePlayer();
        setGameField();
        getGameField();
    }

    public void stopGame() {

    }

    //TODO startGame()
    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();

        makeMove('X');
    }
}
