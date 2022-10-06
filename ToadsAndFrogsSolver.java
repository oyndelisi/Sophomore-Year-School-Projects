import java.util.Scanner;
// https://en.wikipedia.org/wiki/Toads_and_Frogs

public class ToadsAndFrogsSolver {
	public static final char TOAD = 'T', FROG = 'F', EMPTY = '-';

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Board position (using TF-)? ");
		String board = in.nextLine().trim().toUpperCase();
		System.out.print("Current player (T/F)? ");
		char currentPlayer = in.nextLine().trim().toUpperCase().charAt(0);
		System.out.println("Winner: " + getWinner(board.toCharArray(), currentPlayer));
		in.close();
	}

	public static char getWinner(char[] board, char currentPlayer) {
		for (int i = 0; i < board.length; i++) {
			if (currentPlayer == TOAD) {
				if (board[i] == TOAD && i + 1 < board.length && board[i + 1] == EMPTY) {
					board[i] = EMPTY;
					board[i + 1] = TOAD;
					char winner = getWinner(board, FROG);
					board[i + 1] = EMPTY;
					board[i] = TOAD;
					if (winner == currentPlayer) {
						return currentPlayer;
					}
				}
				if (board[i] == TOAD && i + 2 < board.length && board[i + 1] == FROG && board[i + 2] == EMPTY) {
					board[i] = EMPTY;
					board[i + 2] = TOAD;
					char winner = getWinner(board, FROG);
					board[i + 2] = EMPTY;
					board[i] = TOAD;
					if (winner == currentPlayer) {
						return currentPlayer;
					}
				}



			} else if (currentPlayer == FROG) {
				if (board[i] == FROG && i - 1 >= 0 && board[i - 1] == EMPTY) {
					board[i] = EMPTY;
					board[i - 1] = FROG;
					char winner = getWinner(board, TOAD);
					board[i - 1] = EMPTY;
					board[i] = FROG;
					if (winner == currentPlayer) {
						return currentPlayer;
					}
				}
				if (board[i] == FROG && i - 2 >= 0 && board[i - 1] == TOAD && board[i - 2] == EMPTY) {
					board[i] = EMPTY;
					board[i - 2] = FROG;
					char winner = getWinner(board, TOAD);
					board[i - 2] = EMPTY;
					board[i] = FROG;
					if (winner == currentPlayer) {
						return currentPlayer;
					}
				}
			} 
		}
		
		// Algorithm: 
		// For each legal move for the current player,
		//   - if we call getWinner on the resulting game state (new board, other player)
		//     and find that this leads to a win for the current player, 
		//     then return the current player.
		// Otherwise, failing to find a winning play (or any legal play), return the opponent player.
		if (currentPlayer == FROG)
			return TOAD;
				
		else return FROG;
		
	}

}


