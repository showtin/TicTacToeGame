import java.util.*;

public class Test {
    public static List<Integer> playerPosition = new ArrayList<>();

    public static String checkWinner(List<Integer> playerPosition) {
        List<Integer> top = Arrays.asList(1, 2, 3);
        List<List> winCombinations = new ArrayList<>();
        winCombinations.add(top);
        for (List e : winCombinations) {
            if (playerPosition.containsAll(e)) {
                return "congratulations";
            }
        }
        return "fail";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            playerPosition.add(scanner.nextInt());
            System.out.println(checkWinner(playerPosition));
        }
    }
}
