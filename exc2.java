import java.util.Scanner;
public class exc2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n%2!=0 && n<=30 && n>=20)
        System.out.println("Tom");
        if(n%2==0 && n<=30 && n>=20)
        System.out.println("Jerry");

    }

}