import java.util.*
class reverse
{
public static void main(String arng[])
{
Scanner sc=new Scanner(System.in);
String str[]=sc.nextLine().split(" ");
for(int i=0;i<str.length;i++)
{StringBuffer s=new StringBuffer(str[i]);
System.out.print(s.reverse()+" ");
}
}
}
