import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-10
 *
 */
public class TicTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] arr= {{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}};
		Scanner input = new Scanner(System.in);
		char turn = 'X';
		
		System.out.println("Wellcome to Tic-Tac-Toe Program");

		
		
		
		for(int x =1;x<9;x++) {
			
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
			
			System.out.println("Player 1 Symbol: X");
			System.out.println("Player 2 Symbol: O");
			System.out.println("Make a move, Enter a position: ");
			System.out.println("-------------------");
			char position = input.next().charAt(0);
			
			
				for(int i =0;i<arr.length;i++) 
				{
					for(int j =0;j<arr.length; j++) 
					{
						
						 if(position==arr[i][j])  
						{
							if (turn=='X') 
							{    
			                    arr[i][j]='X';
			                    turn ='O';
			                }
			                else
			                {
			                	 arr[i][j]='O';
								 turn = 'X';
			                }
						}
							
					}		
				}
		}	

	}

}
