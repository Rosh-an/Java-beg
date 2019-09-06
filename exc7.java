import java.util.Scanner;
public class exc7
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        long n=sc.nextLong();
        long s=0,s1=0,s2=0,d;
        long Arr[];
        int i=0;
        Arr= new long[100000];


        while(n>0)
        {
            d=n%10;
            if(d%2==0)
            s1=s1+d;
            s=s*10+d;
            n=n/10;
            Arr[i]=d;
            i++;
        }

        for(int k=10;k>0;k--)
            {
            for(int j=0;j<i;j++)
                {
                if(Arr[j]==k)
                s2=s2*10+Arr[j];
                }
        }


        System.out.println(s2);
        System.out.println(s1);
        if(s1>15)
        System.out.println("true");
        else
        System.out.println("false");
        
        // if(s1>25)
        //     System.out.println(m+" is palindrome and sum is greater than 25");
        // else
        //     System.out.println(m+" is palindrome and sum is less than 25");
        // }
        // else
        // {
        //     System.out.println(m+" is not palindrome");
        // }
    }

}