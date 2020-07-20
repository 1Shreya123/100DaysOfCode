import java.util.*;
public class acacius_and_string
{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String check="abacaba";
            if(s.contains("?")==false)
            {
                int temp=0;
                int flag=0;
                for(int i=0;i<s.length();i++)
                {
                    if(s.substring(i,i+7)==check)
                    {
                        temp++;
                    }
                    if(temp>=2)
                    {
                       flag = 1;
                        break;
                    }
                }
                if(flag==1)
                {
                    System.out.println("No");
                }
                else 
                {
                    System.out.println("Yes");
                }
            }
            else
            { 
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='?'
                }

            }

        }
    }
}