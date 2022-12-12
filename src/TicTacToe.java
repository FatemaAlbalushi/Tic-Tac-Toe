import java.util.Scanner;

/**
 * 
 */

/**
 * This program is used to open TicTacToe game
 *
 */
public class TicTacToe {

	/**
	 * The main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		Scanner input = new Scanner(System.in);
		char turn = 'X';
		//boolean play = true;

		System.out.println("Wellcome to Tic-Tac-Toe Program");

		//
		for (int x = 0; x < 9; x++) {
			// Display the board
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
					System.out.print("|" + " ");
				}

				System.out.println();
				System.out.println("-----------");

			}

			System.out.println("Player 1 Symbol: X");
			System.out.println("Player 2 Symbol: O");
			System.out.println("Make a move, Enter a position: ");
			System.out.println("-------------------");
			char position = input.next().charAt(0);

			// replace the position with user symbol
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {

					if (position == arr[i][j]) {
						// player 1 move
						if (turn == 'X') {
							// if the index already has been used
							if (arr[i][j] == 'X' || arr[i][j] == 'O') {
								System.out.println("Error");
								System.exit(0);

							}
							// put the symbol in the index and change the turn
							else {
								arr[i][j] = 'X';
								turn = 'O';
							}
							// ً The winner is X
							// check by raw
							for (i = 0; i <= 2; i++) {
								if (arr[i][0] == 'X' && arr[i][1] == 'X' && arr[i][2] == 'X') {
									System.out.println("Player with symbol X win");
									System.exit(0);
								}

							}
							// check by col
							for (j = 0; j <= 2; j++) {
								if (arr[0][j] == 'X' && arr[1][j] == 'X' && arr[2][j] == 'X') {
									System.out.println("Player with symbol X win");
									System.exit(0);
								}

							}
							// check Diagonal
							if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
								System.out.println("Player with symbol X win");
								System.exit(0);
							}
							if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
								System.out.println("Player with symbol X win");
								System.exit(0);
							}
						}

						// player 2 move
						else {
							// if the index already has been used
							if (arr[i][j] == 'X' || arr[i][j] == 'O') {
								System.out.println("Error");
								System.exit(0);
							}

							// put the symbol in the index and change the turn
							else {

								arr[i][j] = 'O';
								turn = 'X';
							}

							// ً The winner is O
							// check by rawً
							for (i = 0; i <= 2; i++) {

								if (arr[i][0] == 'O' && arr[i][1] == 'O' && arr[i][2] == 'O') {
									System.out.println("Player with symbol O win");
									System.exit(0);

								}
							}
							// check by col
							for (j = 0; j <= 2; j++) {

								if (arr[0][j] == 'O' && arr[1][j] == 'O' && arr[2][j] == 'O') {
									System.out.println("Player with symbol O win");
									System.exit(0);
								}
							}
							// check Diagonal
							if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
								System.out.println("Player with symbol O win");
								System.exit(0);
							}
							if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
								System.out.println("Player with symbol O win");
								System.exit(0);
							}
						}
					}

				}
			}
		}
	}
}
