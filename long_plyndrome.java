import java.util.*;
class long_plyndrome
{
    public static void main(String s1[])
    {   Scanner sc=new Scanner(System.in);
        String s=sc.next();
         Set<String> f=new LinkedHashSet<String>();
        for(int i=0;i<s.length();i++)
        {    for(int j=i;j<s.length();j++)
            {StringBuffer h=new StringBuffer(s.substring(i,j+1));
            String m=h.reverse()+"";
        	if(m.equals(s.substring(i,j+1)))        
                f.add(m);  
            }
        }int l=0;
        for(String d:f)
        {
        	if(l<d.length())
        	{l=d.length();
        		s=d;
        	}
        }System.out.println(s);
    }
}

