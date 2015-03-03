import java.io.*;
import java.util.Scanner;
public class lab3
{
int reg;
	String n;
	lab3()
	{
	Scanner in = new Scanner(System.in);
	System.out.println("ENTER THE STUDENT'S REGISTRATION NO.:");
	reg=in.nextInt();	   
	System.out.println("ENTER THE STUDENT'S NAME :");
	n=in.next();
	} 
}
class marks extends lab3
{
public static void main(String args[])
   {
	double m1,m2,total; 
	marks ob1=new marks();
	Scanner in = new Scanner(System.in);
	System.out.println("ENTER THE MARKS IN SUBJECT 1:");
	m1=in.nextDouble();	   
	System.out.println("ENTER THE MARKS IN SUBJECT 2:");
	m2=in.nextDouble();
	total=m1+m2;
	
	System.out.println("DETAILS OF THE STUDENT");
	System.out.println("NAME: "+ob1.n);
	System.out.println("REGISTRATION NO.  :"+ob1.reg);
	System.out.println("MARKS IN SUBJECT 1  :"+m1);
	System.out.println("MARKS IN SUBJECT 2  :"+m2);
	System.out.println("TOTAL  :"+total);
   }
}