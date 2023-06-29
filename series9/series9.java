//program to display the series
import java.util.*;
public class series9
{
    public static void main()
    {
        int a=2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        System.out.print(a+" ");
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
               a=a*2;
            }
            else
            {
                a=a+2;
            }
            System.out.print(a+" ");
        }
    }
}
