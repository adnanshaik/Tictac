
import java.util.*;
import java.lang.*;

public class TicTac
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

public static void main(String args[])
{
         static String User=0;
         static String Bot=0;
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
                User="O"
        }
        System.out.println(Answer);
}

}

