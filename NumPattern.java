/*----------------------------------------print pattern--------------------------------------------
 

                                    01  02  03  04  05 
                                    06  07  08  09  10
                                    11  12  13  14  15
                                    16  17  18  19  20
                                    21  22  23  24  25 
                        
------------------------------------------------------------------------------------------------------- */
import java.util.Scanner;

public class NUmPattern {
    public static void main(String[] args) {
        int num=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows number:");
        int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++)
             {
                System.out.format( " %02d ",num );
                num++;
             }
           
            System.out.println( );
            
        }
        
        sc.close();
    }
}
