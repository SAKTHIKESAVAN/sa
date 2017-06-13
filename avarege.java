import java.util.*;
class avarege
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int g=0,o=0;
        String s=sc.nextLine();
        String []b=s.split(" ");
        int d[]=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            d[i]=Integer.parseInt(b[i]);
            g=g+d[i];
        }
        int f=(b.length/2);
        float h=g/b.length;
        if(d[f]==h)
        {   System.out.print("[");
             
             for(int i=0;i<=f;i++)
             {
                 System.out.print(d[i]+",");
                 o++;
             }System.out.print("]");
             System.out.print(",[");
             for(int i=o;i<b.length;i++)
             {
                 System.out.print(d[i]+",");
             }
             System.out.print("]");
        }
        
        
    }
}

