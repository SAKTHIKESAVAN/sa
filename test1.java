import java.util.*;
class test1
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
    	String r[]=s.split(" ");
	
		Arrays.sort(r);
		for(int j=r.length-1;j>=0;j--)
		{
			System.out.println(r[j]);
		}
			
		
	}
	
}
