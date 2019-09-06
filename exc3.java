import java.util.Scanner;
public class exc3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input:");
        String n=sc.nextLine();
        n=n.toLowerCase();
        char[] ch=n.toCharArray();
        int len=n.length();
        if(len==1)
        {
            if(ch[0]=='a' || ch[0]=='e' || ch[0]=='i' || ch[0]=='o' || ch[0]=='u')
            System.out.println("Vowel");
            else
            System.out.println("Consonant");
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                System.out.print("Vowel ");
                else
                System.out.print("Consonant ");
            }
        }

    }

}