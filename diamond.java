import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           /* for(int j=1;j<=(2*n)-1;j++)
            {
                if(j>=(n+1)-i && j<=(n-1)+i)
                    System.out.print("*"+" ");
                else
                System.out.print("  ");
            }
            System.out.println();}
            for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(2*n)-1;j++)
            {
                if(j>=(n+1)-i && j<=(n-1)+i)
                    System.out.print("*"+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }*/
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    }
}