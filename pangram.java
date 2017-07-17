import java.util.*;
class pangram
{
    public static void main(String s1[])
    {   Scanner sc=new Scanner(System.in);int l=0;
        String s[]=sc.nextLine().replace(" ","").split("");
         Set<String> f=new LinkedHashSet<String>();
        for(int i=0;i<s.length;i++)
        {//System.out.println(s[i]);
        	if(Character.isLetter(s[i].charAt(0)))
        	{if(f.add(s[i]))
            {l++;}}
        }
        if(l-1==26)
        	System.out.println("Given string is pangram");
        else	
        	System.out.println("Given string is Not pangram");
    }
}

