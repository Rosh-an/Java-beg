import java.util.Scanner;
public class exc8
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m=21;
        int n=100;
        while(n!=m)
        {
            System.out.println("Enter a number(1-50):");
            n=sc.nextInt();
            if(n<m)
            System.out.println(n+" is less than original number... Try again");
            else if(n>m)
            System.out.println(n+" is greater than original number... Try again");
            else
            System.out.println("Voila! You got it");
        }
        

    }

}