
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

public class ResultChecker {
    public static void checkResult(String userMove, String computerMove, String[] moves) {
        Graph<String, DefaultEdge> graph = buildGraph(moves);

        System.out.println("Your move: " + userMove);
        System.out.println("Computer move: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("Draw!");
        } else if (graph.containsEdge(userMove, computerMove)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    private static Graph<String, DefaultEdge> buildGraph(String[] moves) {
        Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
        for (String move : moves) {
            graph.addVertex(move);
        }

        int n = moves.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                graph.addEdge(moves[i], moves[(i + j) % n]);
            }
        }
        return graph;
    }
}