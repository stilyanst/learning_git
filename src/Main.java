import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player player1 = new Player("P1", "X");
		Player player2 = new Player("P2", "O");
		Board board = new Board();
		
		
		while (true) {
			board.displayBoard();
			board.checkWin();
			
			if (Arrays.asList(board.boardArr).contains(" ") == false) {
				break;
			}
				
			int tempChoiceP1 = player1.chooseMarkSpot(sc);
			if (board.boardArr[tempChoiceP1].isBlank()) {
				board.boardArr[tempChoiceP1] = player1.mark;
			}
			
			board.displayBoard();
			if (board.checkWin().equals("not yet") == false) {
				break;
			}
			
			if (Arrays.asList(board.boardArr).contains(" ") == false) {
				break;
			}
			
			int tempChoiceP2 = player2.chooseMarkSpot(sc);
			if (board.boardArr[tempChoiceP2].isBlank()) {
				board.boardArr[tempChoiceP2] = player2.mark;
			}
		}
		sc.close();
		System.out.println("END");
	}
}


