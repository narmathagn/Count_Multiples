import java.util.*;
public class Count_Multiples 
{
    public static void main (String[] args) {
        int n,x,i,j,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n and x");
        n=s.nextInt();
        x=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the n values:");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if((a[i]%x==0)&&(a[i]>x))
            {
                c++;
            }
        }
        System.out.println(c);
    }

}