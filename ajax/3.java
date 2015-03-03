import java.io.*;
import java.util.Scanner;
public class lab4
{
int id,age;String name;
lab4(int id,String name,int age)
	{
		this.id = id;  
    		this.name = name; 
		this.age=age;
	} 
void display()
	{
    System.out.println("ID    : "+this.id);
    System.out.println("NAME  : "+this.name);
    System.out.println("AGE   : "+this.age);
}
}
class mar extends lab4
{  
double m1,m2;
	mar(int id,String name,int age,double m1,double m2)
	{
	super(id,name,age);
    	this.m1=m1;
	this.m2=m2;
	}
	

void display1()
{
super.display();
System.out.println("");
System.out.println("");
System.out.println("MARKS IN MATHS      :"+this.m1);
System.out.println("MARKS IN COMPUTER   :"+this.m2);
System.out.println("TOTAL MARKS         :"+(this.m1+this.m2));
}
    public static void main(String args[])
    {

	mar ob=new mar(70,"SIMRANDEEP SINGH",19,50,60);
	ob.display1();
    }
}

