
import java.util.Scanner;

public class NumAlphabet {
    public static void main(String[] args)
    {
        char ch='A';
        int no=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row=sc.nextInt();
        for (int i = 1; i <= row; i++) 
        {
            no=i+1;
            for (int j = 1; j <=row; j++) 
            {
                if (i==j) 
                {
                    System.out.print(ch+" ");
                    ch++;
                } 
                else 
                {
                   System.out.print(no+" "); 
                }
                no++;
            }
            System.out.println( );
        }
        sc.close();
    }
}
