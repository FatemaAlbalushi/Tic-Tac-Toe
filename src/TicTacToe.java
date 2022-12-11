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
		boolean play=true;
		
		System.out.println("Wellcome to Tic-Tac-Toe Program");

		
		
		
			
	
		for(int x =0;x<9;x++) {
			
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
		
			//Checking 
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
			                  //ً Who is the winner
			    				for(i =0;i<=2;i++) 
			    				{
			    					if (arr[i][0]=='X' && arr[i][1]=='X' && arr[i][2]=='X')
			    					{
			    						
			    						System.out.println("Player with symbol X win");
			    						System.exit(0);
			    					}
			    					
			    				}
			    				
			    				for(j =0;j<=2;j++) 
			    				{
			    					if (arr[0][j]=='X' && arr[1][j]=='X' && arr[2][j]=='X')
			    					{
			    						
			    						System.out.println("Player with symbol X win");
			    						System.exit(0);
			    						
			    					}
			    					
			    				}	
			    				if(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X') 
								{
									System.out.println("Player with symbol X win");
									System.exit(0);
								}
			                }
			                else
			                {
			                	 arr[i][j]='O';
								 turn = 'X';
								//ً Who is the winner
									for(i =0;i<=2;i++) 
									{
										
										 if (arr[i][0]=='O' && arr[i][1]=='O' && arr[i][2]=='O')
										{ 
											System.out.println("Player with symbol O win");
											
											System.exit(0);
											
										}
									}
									
									for(j =0;j<=2;j++) 
									{
										
										if (arr[0][j]=='O' && arr[1][j]=='O' && arr[2][j]=='O')
										{ 
											System.out.println("Player with symbol O win");
											System.exit(0);
										}
									}	
									if(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O') 
									{
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

