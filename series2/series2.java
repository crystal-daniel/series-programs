//program to display the sum of the series
import java.util.*;
public class series2
{
    public static void main()
    {
       double sum=0;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=input.nextInt();
       int i=1;
       do
       {
        sum=sum+Math.pow(i,i);
        i++;
       }
       while(i<=n);
       System.out.println("sum of the cubes of the series ="+sum);
    }
}
