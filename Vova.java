import java.util.*;

public class Vova {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            int n=sc.nextInt();
           int  k=3;
    while (n%k!=0){
        k=2*k+1;
    }
    System.out.println(n/k);
        }
    }
}