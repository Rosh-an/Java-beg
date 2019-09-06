import java.util.Scanner;
public class exc6
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input :");
        int n=sc.next().charAt(0);
        int a=(int)n;
        if(a<=90 && a>=65)
        System.out.println("Uppercase");
        else if(a>=97 && a<=122)
        System.out.println("Lowerrcase");
        else if(a>=48 && a<=57)
        System.out.println("Digit");
        else
        System.out.println("Special symbol");

    }

}