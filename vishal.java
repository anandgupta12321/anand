import java.util.*;
class sum{
String x;
char z,a;
int c,b,z,d;
Scanner sc=new Scanner(System.in);
void accept(){
System.out.println("Enter your name");
x=sc.next();
System.out.println("Enter the first letter of your name");
z=sc.next();
System.out.println("Enter the last letter of your name");
a=sc.next();
System.out.println("Enter your pf");
c=sc.nextInt();
System.out.println("Enter your ESIC");
b=sc.nextInt();
System.out.println("Enter your total Salary");
z=sc.nextInt();
d=z-c-b;
}
void display(){
System.out.println("The name is "+x+".");
System.out.println(x+"'s first letter of name is "+z+".");
System.out.println(x+"'s last letter of name is "+a+".");
System.out.println(x"'s Final salary is "+d+".");
}
class sum2{
String q;
char w,e;
int r,t,y,u;
Scanner sc=new Scanner(System.in);
void accept(){
super.accept();
System.out.println("Enter your name");
q=sc.next();
System.out.println("Enter the first letter of your name");
w=sc.next();
System.out.println("Enter the last letter of your name");
e=sc.next();
System.out.println("Enter your pf");
r=sc.nextInt();
System.out.println("Enter your ESIC");
t=sc.nextInt();
System.out.println("Enter your total Salary");
y=sc.nextInt();
u=y-t-y;
}
void display(){
supoer.display();
System.out.println("The name is "+q+".");
System.out.println(q+"'s first letter of name is "+w+".");
System.out.println(q+"'s last letter of name is "+e".");
System.out.println(q"'s Final salary is "+u+".");
}
public static void main(String[] v){
sum o=new sum2();
o.accept();
o.display();
}
}
