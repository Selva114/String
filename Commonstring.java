public class Commonstring
{
public static void main(String args[])
{
String a="Mississippi is a south America state with the Mississippi River to its west, the state of Alabama to its east, and the Gulf of Mexico to the south";

String b="Venezuela is a country on the northern coast of south America, consisting of a continental landmass and many islands and islets in the Caribbean Sea";

String x[]=a.split(" ");
String y[]=b.split(" ");

System.out.println("Common word between two string : ");

for(int i=0;i<x.length;i=i+1)
{
System.out.println(x[i]);

for(i=0;i<y.length;i=i+1)
{
System.out.println(y[i]);
}
if(x[i]==y[i])
{
System.out.println(x[i]);
}

}

}

}
}




















