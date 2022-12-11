import java.security.PublicKey;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class TicTacToeMain {
	
	public static void main() {
		
	
	
	Scanner input = new Scanner(System.in);
	char turn = 'X';
	boolean player1 = true;
	
	System.out.println("Wellcome to Tic-Tac-Toe Program");
	display();
	
	}
	
	public static void display() 
	{
		char[][] arr= {{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}};
		
		for(int i =0;i<arr.length;i++) 
		{
			for(int j =0;j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
				System.out.print("|"+" ");		
			}
			
			System.out.println( );
			System.out.println( "-----------");
			
		}
	}

	
	
	public void check_avilable() {
		
		
		
		
	}
}
