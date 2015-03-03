public class lab5
{  
   int rollno;  
   String name;  
   static String college ="CHRIST UNIVERSITY";  
   static int i;
   lab5(int r,String n)
   {  
   rollno = r;  
   name = n;  
   }  
 void display ()
 {
	i++;
      System.out.println("ROLL NO.     : "+rollno);
      System.out.println("NAME         : "+name);
      System.out.println("COLLEGE      : "+college);
      System.out.println(" ");
 }  
 public static void main(String args[])
 {  
 System.out.println(" ");
 lab5 s1 = new lab5(70,"Simrandeep");  
 lab5 s2 = new lab5(67,"Shreyas");  
 s1.display();  
 s2.display();  
 System.out.println("TOTAL NUMBER OF STUDENS = "+i);
 }  
}  