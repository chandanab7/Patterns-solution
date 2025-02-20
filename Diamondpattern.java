/* ------------------------                                                               
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
--------------------------------------*/


public class Diamondpattern {
    public static void main(String[] args) {
        //--------------------------------------------------Upper half-------------------------------------


        for (int i = 1; i <= 5; i++)
         {
           for (int j = 4; j>=i; j--) 
           {
               System.out.print(" ");
           } 
           for (int j = 1; j<=i; j++)
            {
               System.out.print("*");
           }
           for (int j = 1; j <= i-1; j++) 
           {
            System.out.print("*");
               
           }
           System.out.println( );
        }

        //----------------------------------------------------Lower half---------------------------------




        for (int i = 1; i <= 4; i++)
        {
           for (int j = 1; j<=i; j++) 
           {
               System.out.print(" ");
           } 
           for (int j = 4; j >= i; j--) 
           {
            System.out.print("*");
               
           }
           for (int j = 4; j>i; j--) 
           {
            System.out.print("*");
               
           }
           System.out.println( );
        }
    }
}
