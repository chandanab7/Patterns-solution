public class Pattern {
    public static void main(String[] args) {

        //------------------------------------for Upper Part----------------------
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(" *");
            }
            for (int j = 4; j>=i; j--) 
            {
                System.out.print("  ");
            }
            for (int j = 4; j>=i; j--) 
            {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) 
            {
                System.out.print(" *");
            }
                    System.out.println( );
        }

        //---------------------------------------------Lower part--------------------------------------------------
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 5; j>=i; j--) 
            {
                System.out.print(" *");
            }
            for (int j = 1; j<=i-1; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 1; j<=i-1; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 5; j >=i; j--) 
            {
                System.out.print(" *");
            }
                    System.out.println( );
        }
    }
}
