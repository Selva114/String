public class Palindrome
{
public static void main(String args[])
{
String s = "malayalam";
char c[] = new char[s.length()];
for(int i=0 ; i < c.length;i=i+1)
{
c[i]=s.charAt(s.length()-1-i);
}
// Char array to String conversion
String x=""; // Empty String
for(int i=0;i<c.length;i=i+1)
{
x=x+c[i];
}
System.out.println(x);
if(s.equals(x))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}

