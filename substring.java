import java.util.*;
class substring
{
    public static void main(String s11[])
    {   Scanner sc=new Scanner(System.in);
        String s=sc.next();String s1=sc.next();
         Set<String> f=new LinkedHashSet<String>();
         Set<String> f1=new LinkedHashSet<String>();
         Set<String> f2=new LinkedHashSet<String>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
                   f.add(s.substring(i,j+1));
        
        }    for(int i=0;i<s1.length();i++)
        {
            for(int j=i;j<s1.length();j++)
                       
                f1.add(s1.substring(i,j+1));
         }
        int l=0;
        for(String b:f )
        {
        	for(String b1:f1)
        		{
        		
    	if(b.equals(b1))        
            f2.add(b);}
           
        }
        for(String d:f2)
        {
        	if(l<d.length())
        	{l=d.length();
        		s=d;
        	}
        }System.out.println(s);
    }
}

