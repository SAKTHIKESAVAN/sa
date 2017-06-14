import java.util.*;
class dublicate
{
    public static void main(String a[])
    {
        int i=0,j=0,m=0,n,l=0;
       Scanner sc=new Scanner(System.in);
   
        String b=sc.nextLine();
        String c[]=b.split("");
        n=c.length;
    
    
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(c[i].equals(c[j])&&c[i]!="")
                {                     c[j]="";
                    l++;
                }
            }
        }
        
        
        for(i=0;i<n;i++)
        {   if(c[i]!="")
            System.out.print(c[i]);
        }System.out.println(l);
    }
}







