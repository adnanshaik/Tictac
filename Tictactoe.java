import java.util.*;
import java.lang.*;

public class TicTactoe
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

  
   }

public static void main(String args[])
{
     
        char[] board=createBoard();
}



