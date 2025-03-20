import java.io.*;
class Arith
{
public static void main (String args[])
{
try
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("ARITHMETIC OPERATION");
System.out.println("--------------------");
System.out.println("Enter the First No:");
String s1 = br.readLine();
int a=Integer.parseInt(s1);
System.out.println("Enter the Secound no:");
String s2 = br.readLine();
int b=Integer.parseInt(s2);
System.out.println("Result");
int c=a+b;
System.out.println("Add:"+c);
c=a-b;
System.out.println("Sub:"+c);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}