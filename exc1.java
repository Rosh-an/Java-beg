import java.util.Scanner;
public class exc1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        long n=sc.nextLong();
        long s=0,s1=0,m=n,d;
    


        while(n>0)
        {
            d=n%10;
            if(d%2==0)
            s1=s1+d;
            s=s*10+d;
            n=n/10;
        }

        if(s==m)
        {
            if(s1>25)
            System.out.println(m+" is palindrome and sum is greater than 25");
            else
            System.out.println(m+" is palindrome and sum is less than 25");
        }
        else
        {
            System.out.println(m+" is not palindrome");
        }
    }

}