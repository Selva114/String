//to replace character in a string 

public class Multicharreplace
{
public static void main(String args[])
{
String s="Narayana swamy resigned as a chief minister from Pondichery";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i=i+1)
{
if(c[i]=='s')
{
c[i]='$';

}
if(c[i]=='d')
{
c[i]='@';

}

if(c[i]=='i')
{
c[i]='I';

}

if(c[i]=='y')
{
c[i]='I';

}

if(c[i]=='r')
{
c[i]='R';

}
System.out.println(c[i]);
}
}
}












