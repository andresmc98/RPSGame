import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoveValidator {
    public static void validateArgs(String[] args) {
        if(args.length < 3 || args.length % 2 == 0){
            System.out.println("Error: Please provide an odd number of moves ≥ 3.");
            System.exit(1);
        }
        Set<String> moves = new HashSet<>(Arrays.asList(args));
        if (moves.size() != args.length){
            System.out.println("Error: Moves must be non-repeating");
            System.exit(1);
        }
    }
}
