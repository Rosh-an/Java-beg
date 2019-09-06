import java.util.Scanner;
public class exc10
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        
        
        
        
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }

        for(int j=1;j<=n;j++)
        {
        for(int i=s.length()-n;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
         }

    }

}