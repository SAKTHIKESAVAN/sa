import java.util.*;
class dec
{
    public static void main(String c1[])
    {Scanner sc= new Scanner(System.in);
    String c[]=sc.nextLine().split(" ");
        Arrays.sort(c);
    int n=c.length;
        
        for(int i=n-1;i>=0;i--)
        {   
            System.out.println(c[i]);
        }
    }
}
