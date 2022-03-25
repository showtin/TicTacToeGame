import java.util.*;

public class TicTacToe implements WinCombinations {
    public static Map<Integer, Character> field = new HashMap<>();
    public static Character player;
    public static Character player2;
    public static List<Integer> playerPosition = new ArrayList<>();
    public static List<Integer> secondPlayerPosition = new ArrayList<>();

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


    public static void makePlayerMove(Character player) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("select a number from 1 to 8");
        Integer playerMove = scanner.nextInt();
        if (player.equals('X')) {
            field.put(playerMove, player);
            playerPosition.add(playerMove);
        }
        if (player.equals('O')) {
            field.put(playerMove, player);
            secondPlayerPosition.add(playerMove);
        }
    }

    public static void checkWin(List<Integer> playerPosition) {
        
        winCombinations.add(topRow);
        winCombinations.add(midRow);
        winCombinations.add(botRow);
        winCombinations.add(leftCol);
        winCombinations.add(midCol);
        winCombinations.add(rightCol);
        winCombinations.add(cross1);
        winCombinations.add(cross2);


        for (List<Integer> combination : winCombinations) {
            if (playerPosition.containsAll(combination)) {
                System.out.println("win");
            }
        }
    }

    //TODO Нужно сделать так чтобы ходы игроков чередовались друг за другом
    //TODO Работаем над предфинальной стадии разработки (собираем всё воедино)
    //TODO В финальной стадии нужно будет исправить все баги, улучшить читабельность кода+упростить его, сделать тесты
    public static void startGame() {
        choosePlayer();
        setGameField();
        while (true) {
            getGameField();
            makePlayerMove(player);
            checkWin(playerPosition);
        }
    }

    public static void main(String[] args) {

        startGame();
    }
}
