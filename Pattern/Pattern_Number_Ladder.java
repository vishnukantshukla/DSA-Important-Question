package Pattern;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<i+1;j++)
                System.out.print(k+++"\t");
            System.out.println();
        }
    }
}
