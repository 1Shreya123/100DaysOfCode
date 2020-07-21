import java.util.*;
public class Omkar_and_Last_Class_of_Math {
        
        int gcd(int a,int b)
        {
            if (a==0)
            return b;
            else
            return gcd(b%a,a);
        }
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          Omkar_and_Last_Class_of_Math obj=new Omkar_and_Last_Class_of_Math();
          int t=sc.nextInt();
          while(t-- >0)
          {
              int n=sc.nextInt();
              for(int i=1;i<=n/2;i++)
              {
                int a=i;
                int b=n-i;
                int gc=obj.gcd(a,b);
                int lcm

              }
               
          }
        }
    }
    
