import java.util.Scanner;

public class Menu {
    public static void display(String[] moves) {
        System.out.println("Available moves:");
        for (int i = 0; i < moves.length; i++) {
            System.out.println((i + 1) + " - " + moves[i]);
        }
        System.out.println("0 - Exit");
        System.out.println("? - Help");
    }

    public static String getUserMove(String[] moves) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your move: ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                System.exit(0);
            } else if (input.equals("?")) {
                Help.displayHelp(moves);
            } else {
                try {
                    int moveIndex = Integer.parseInt(input) - 1;
                    if (moveIndex >= 0 && moveIndex < moves.length) {
                        return moves[moveIndex];
                    }
                } catch (NumberFormatException e) {
                    // Ignore invalid number format
                }
            }
            System.out.println("Invalid input, please try again.");
        }
    }
}