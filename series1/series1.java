//program to display the sum of the series
import java.util.*;
public class series1
{
    public static void main()
    {
       int sum=0;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=input.nextInt();
       int i=1;
       do
       {
        if(i%2==0)
        {
          sum=sum-i;
        }
        else
        {
          sum=sum+i;
        }
        i++;
       }
       while(i<=n);
       System.out.println("sum of the series="+sum);
    }
}
