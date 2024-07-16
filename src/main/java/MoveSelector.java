import java.util.Random;

public class MoveSelector {
    public static String selectMove(String[] moves){
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
