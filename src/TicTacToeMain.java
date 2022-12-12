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
		
	char[][] arr= {{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}};
		
	
	Scanner input = new Scanner(System.in);
	char turn = 'X';
	boolean player1 = true;
	boolean gameover = false;
	
	System.out.println("Wellcome to Tic-Tac-Toe Program");
	
	while (!gameover) 
	{
		
		
	
		display(arr);
		
		while (true)
		{
			System.out.println("Player 1 Symbol: X");
			System.out.println("Player 2 Symbol: O");
			System.out.println("Make a move, Enter a position: ");
			System.out.println("-------------------");
			char position = input.next().charAt(0);
			
			if (position>9) 
			{
				System.out.println("");
			}
			break;
		}
		
		
		if ( iswin(arr)=='X') 
		{
			System.out.println("Player with symbol O win");
			gameover=true;
			
		}
		else if (iswin(arr)=='O') 
		{
			System.out.println("Player with symbol O win");	
			gameover=true;
		}
		else
		{
			if (isFull(arr))
			{
				System.out.println("It's a Tie");
				gameover=true;
			}
			else 
			{
				player1=!player1;
			}
			
		
		}
		
	}
	display(arr);
	}
	
	public static void display(char[][] arr) 
	{
		
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
	 
	
	
	public static char iswin(char[][] arr)
	{
		for(int i =0;i<=2;i++) 
		{
			if (arr[i][0] == arr[i][1] &&  arr[i][1] == arr[i][2] && arr[i][0] =='X' || arr[i][0] =='O' )
			{
				return arr[i][0];
			}
				
		}
			
		for(int j  =0;j<=2;j++) 
		{
			if (arr[0][j]== arr[1][j] && arr[1][j] == arr[2][j] && arr[j][0] =='X' || arr[j][0] =='O')
			{
				return arr[0][j];
			}
				
		}	
		if(arr[0][0]== arr[1][1] && arr[1][1]== arr[2][2] && arr[0][0] =='X' || arr[0][0] =='O') 
		{
		
			return arr[0][0];
		}
		if(arr[0][2]== arr[1][1] && arr[1][1]== arr[2][0] && arr[0][2] =='X' || arr[0][0] =='O') 
		{
		
			return arr[0][2];
		}
		return 0;
			
	}
	
	public static boolean isFull(char[][] arr) 
	{
		for(int i =0;i<arr.length;i++) 
		{
			for(int j =0;j<arr[i].length; j++) 
			{
				if (arr[i][j]==1 && arr[i][j]==2 && arr[i][j]==3 &&
						arr[i][j]==4 && arr[i][j]==5 && arr[i][j]==6 &&
						arr[i][j]==7 && arr[i][j]==8 && arr[i][j]==9)
				{
					return false;
				}
			}
		}
		return true;
	}
}
