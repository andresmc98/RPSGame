import com.jakewharton.fliptables.FlipTable;

public class Help {
    public static void displayHelp(String[] moves) {
        int n = moves.length;
        String[] headers = new String[n + 1];
        headers[0] = "";
        System.arraycopy(moves, 0, headers, 1, n);

        String[][] data = new String[n][n + 1];
        for (int i = 0; i < n; i++) {
            data[i][0] = moves[i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    data[i][j + 1] = "Draw";
                } else if ((j > i && j <= i + n / 2) || (j < i && j >= i - n / 2)) {
                    data[i][j + 1] = "Win";
                } else {
                    data[i][j + 1] = "Lose";
                }
            }
        }

        String table = FlipTable.of(headers, data);
        System.out.println(table);
    }
}