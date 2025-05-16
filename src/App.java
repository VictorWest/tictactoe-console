import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> boardPieces = new ArrayList<>(9);
        for(int i = 0; i < 9; i++){
            boardPieces.add(".");
        }
        boolean isTurn = true;
        
        while (true){
            String turn = TicTacToe.Turn(isTurn);
            int input;

            do {
                input = Guess.getInt("Box number: ", scanner);
            } while ((input > 9 || input < 1) || boardPieces.get(input - 1) != ".");

            boardPieces.set(input - 1, turn);
            TicTacToe.Board(boardPieces);

            boolean winStatus = TicTacToe.checkXOWinStatus(boardPieces, ".");
            if(winStatus){
                System.out.println(turn + " has won!");
                break;
            }


            isTurn = !isTurn;

            boolean isFull = true;
            for (String str : boardPieces) {
                if (str == "."){
                    isFull = false;
                }
            }
            if (isFull) {
                System.out.println("It's a tie.");
                break;
            }
        }
    }
}