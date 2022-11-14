class parent
{
int x=12;
String y="huwtg";
public parent()
{
System.out.println("the first value is" +x);
System.out.println("the second value is" +y);
}
}
class anand1 extends parent
{
public anand1()
{
int z=565;
int t=45;
System.out.println("the first character is" +z);
System.out.println("the second character is" +y);
}
}
class anand2 extends anand1
{
public anand2()
{
int h =43;
System.out.println("the first value of string is" +h);
}
}
class anand3 extends anand2
{
public anand3()
{
int c=34;
System.out.println("the first value integer is" +c);
}
}
class kite
{
public static void main(String [] args)
{
parent ob= new anand3();
}
}