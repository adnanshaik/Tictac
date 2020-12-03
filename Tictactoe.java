
import java.util.*;
import java.lang.*;

public class Tictactoe
{

	 public static  char[] createBoard()
     	{
           char board[] = new char [10];
            for(int i=1;i<=board.length;i++)
           {
             board[i]=' ';
           }
           return board;
        }

        public static String userData()
        {

               Scanner sc = new Scanner(System.in);
               System.out.println("entr x or o");

                String data=sc.nextLine();
                if(data.equals("X"))
                {
                 return data;
                }
        }

	public static void displayGame()
	{
        System.out.println("|---|---|---|");
        System.out.println("| " + board[1] + " | "
                           + board[2] + " | " + board[3]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                           + board[5] + " | " + board[6]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                           + board[8] + " | " + board[9]
                           + " |");
        System.out.println("|---|---|---|");
         }
	}


	public static void moveUser(char[] game,String user)
	{
		System.out.println("enter 0-9");
		Scanner n = new Scanner(System.in);
		int num=n.nextInt();
		if(num>9)
		{
		System.out.println("enter again");
		}
		else if(game[num]==' ')
			{
			   game[num]=user.charAt(0);
			}
		else
			{
			System.out.println("enter again");
			displayGame(board);
			}


}

public static void main(String args[])
{
        String User=null;
        String Bot=null;
        char[] board=createBoard();
        String Answer=userData();

        if(Answer.equals("X"))
        {
                User="X";
                 Bot="O";
        }
        else
        {
                Bot="X";
                User="O";
        }

      	displayGame(board);
	moveUser(board,Answer);

}
}

