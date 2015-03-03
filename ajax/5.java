import java.io.*;
import java.util.Scanner;
interface Inte
{
   public void m1();
   public void m2();
}
class sim implements Inte
{
  public void m1()
  {
	Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM TO MAKE DIAMOND SHAPE IMPLEMENTING INTERFACE");
        int i,j,k,n;
        System.out.println("\nEnter the no lines to be printed: ");
	n=in.nextInt();
       for(i=0;i<n;i++)
       {
       for(j=0;j<(n-i-1);j++)
       System.out.print(" ");
       for(k=0;k<(2*i+1);k++)
       System.out.print("*");
       System.out.println("\n");
       }
       for(i=0;i<n-1;i++)
       {
       for(j=0;j<=i;j++)
       System.out.print(" ");
       for(k=(2*n-2*i-3);k>0;k--)
       System.out.print("*");
      System.out.println("\n");
      }
  }
   public void m2()
  {
	Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM TO MAKE SQUARE SHAPE IMPLEMENTING INTERFACE");
         int i,j,k,n;
       System.out.println("Enter the number of lines to be printed:");
       n=in.nextInt();
       for(i=0;i<n;i++)
            System.out.print("*");
       System.out.println("\n");
       for(i=0;i<n-2;i++)
       {
              System.out.print("* ");
              for(j=0;j<n-2;j++)
                     System.out.print(" ");
              System.out.println("*\n");
       }
        for(i=0;i<n;i++)
              System.out.print("*"); }
  
  public static void main(String arg[])
  {
int c;
      sim obj = new sim();
	Scanner in = new Scanner(System.in);
	System.out.println("ENTER 1 TO MAKE DIAMOND AND 2 TO MAKE SQUARE");
	c=in.nextInt();
      if(c==1) 
      {
      	obj. m1();
      }
      else
     {
        obj. m2();
     }
}
}