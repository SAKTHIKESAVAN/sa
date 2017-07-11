import java.util.*;
class dublicate1
{
    public static void main(String c[])
    {
        int i=0,j=0,m=0,n,l=0;
       Scanner sc=new Scanner(System.in);
    
        
     
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(c[i].equals(c[j]))
                {                     c[j]="";c[i]="";
                    l++;
                }
            }
        }
        
        
        for(i=0;i<n;i++)
        {   if(c[i]!="")
            System.out.println(c[i]);
        }
    }
}








