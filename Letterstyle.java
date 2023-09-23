public class Letterstyle
{
public static void main(String args[])
{
String s="java";
for(int i=1;i<=s.length();i=i+1)
{
for(int j=0;j<i;j=j+1)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
for(int i=0;i<s.length()-1;i=i+1)
{
for(int j=0;j<i;j=j+1)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}
}
