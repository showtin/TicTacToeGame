import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface WinCombinations {

    List<Integer> topRow = Arrays.asList(0, 1, 2);
    List<Integer> midRow = Arrays.asList(3, 4, 5);
    List<Integer> botRow = Arrays.asList(6, 7, 8);
    List<Integer> leftCol = Arrays.asList(0, 3, 6);
    List<Integer> midCol = Arrays.asList(1, 4, 7);
    List<Integer> rightCol = Arrays.asList(2, 5, 8);
    List<Integer> cross1 = Arrays.asList(0, 4, 8);
    List<Integer> cross2 = Arrays.asList(2, 4, 6);

    List<List<Integer>> winCombinations = new ArrayList<>();

}
