public class RPSGame {
    public static void main(String[] args) {

        //Validate Arguments
        MoveValidator.validateArgs(args);

        //Generate Key and Computer Move
        KeyGenerator keyGen = new KeyGenerator();
        String key = keyGen.generateKey();
        String computerMove = MoveSelector.selectMove(args);
        String hmac = HmacGenerator.generateHMAC(computerMove, key);

        //Display HMAC and Menu
        System.out.println("HMAC: " + hmac);
        Menu.display(args);

        //User Interaction and Result
        String userMove = Menu.getUserMove(args);
        ResultChecker.checkResult(userMove, computerMove, args);

        //Display key for verification
        System.out.println("HMAC key: " + key);
        System.out.println("Verify the HMAC using an online HMAC calculator with the key and the move.");
    }
}
