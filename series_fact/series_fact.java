//program to find the sum of the series
import java.util.*;
public class series_fact
{
    public static void main()
    {
       double fact=1,sum=0;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=input.nextInt();
       for(int i=1;i<=n;i++)
       {
           fact=1;
           for(int j=1;j<=i;j++)
           {
               fact=fact*j;
           }
           sum=sum+(double)(i/fact);
       }
       System.out.println("The sum of the series is: "+sum);
    }
}
