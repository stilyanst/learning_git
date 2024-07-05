import java.util.Arrays;

public class Board {

	String[] boardArr = {" ", " ", " ",
						 " ", " ", " ",
						 " ", " ", " "};
	void displayBoard() {
		System.out.println(boardArr[0] + "|" + boardArr[1] + "|" + boardArr[2]);
		System.out.println("-|-|-");
		System.out.println(boardArr[3] + "|" + boardArr[4] + "|" + boardArr[5]);
		System.out.println("-|-|-");
		System.out.println(boardArr[6] + "|" + boardArr[7] + "|" + boardArr[8]);
		
	}
	
	String checkWin() {
		
		for (int i = 0; i < 8; i++) {
			String line = null;
			
			switch (i) {
			case 0:
				line = this.boardArr[0] + this.boardArr[4] + this.boardArr[8];
				break;
			case 1:
				line = this.boardArr[2] + this.boardArr[4] + this.boardArr[6];
				break;
			case 2:
				line = this.boardArr[0] + this.boardArr[1] + this.boardArr[2];
				break;
			case 3:
				line = this.boardArr[3] + this.boardArr[4] + this.boardArr[5];
				break;
			case 4:
				line = this.boardArr[6] + this.boardArr[7] + this.boardArr[8];
				break;
			case 5:
				line = this.boardArr[0] + this.boardArr[3] + this.boardArr[6];
				break;
			case 6:
				line = this.boardArr[1] + this.boardArr[4] + this.boardArr[7];
				break;
			case 7:
				line = this.boardArr[2] + this.boardArr[5] + this.boardArr[8];
				break;
			}
			
			if (line.equals("XXX")) {
				System.out.println("X wins");
				return "X";
			} else if (line.equals("OOO")) {
				System.out.println("O wins");
				return "O";
			} else if (Arrays.asList(boardArr).contains(" ") == false) {
				System.out.println("Tie");
				return "TIE";
			}
		}
		return "not yet";
	}
}
