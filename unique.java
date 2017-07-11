import java.util.*;
class unique
{
   
    public static void main(String[] args)
	{

    
   Scanner sc=new Scanner(System.in);
   Set<String> a=new TreeSet<String>();
    for(String s:args)
    {
        a.add(s);
    }
        for(String l:a)
        {
            System.out.print(l+" ");
        }
    
	}
}

