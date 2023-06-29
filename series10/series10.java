//program to print the sum of the series
import java.util.*;
public class series10
{
    public static void main()
    {
        int s1=0,s2=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            s1=0;
            for(int j=1;j<=i;j++)
            {
                s1=s1+j;
            }
            s2=s2+s1;
        }
        System.out.println("The sum of the series= "+s2);
    }
}
