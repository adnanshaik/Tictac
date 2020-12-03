
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

                String User=sc.nextLine();
                if(User=="X")
                {
                 return User;
                }
        }

	public static void displayGame(char show[])
	{
		int count=0;
		for(int k=1;k<=3;k++)
		{
		 for(int i=1;i<=show.length-1;i++)
		 {
			count+=count;
			System.out.println(show[count]);
		 }
		}
	}
}

public static void main(String args[])
{
        String User=null;
        String Bot=null;
        char[] board=createBoard();
        String Answer=userData();

        if(Answer=="X")
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

}

}

