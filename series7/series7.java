//program to display the series
import java.util.*;
public class series7
{
    public static void main()
    {
      int a=3;
      Scanner input= new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=input.nextInt();
      for(int i=1;i<=n;i++)
      {
          System.out.print(a+" ");
          a=a+3;
      }
    }
}

