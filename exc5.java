import java.util.Scanner;
public class exc5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char ch;
        int n,s=0;
        while(true)
        {
            n=sc.nextInt();
            s=s+n;
            System.out.println("Do you want to stop?(Y/N)");
            ch=sc.next().charAt(0);
            if(ch=='Y' || ch=='y')
            {
                break;
            }

            
        }
        System.out.println("Sum="+s);
        
    }

}