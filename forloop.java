import java.util.*;
class forloop
{

 public static void main (String args[])
{
    int a;
Scanner sc =new Scanner(System.in);
   System.out.println("Enter any number");
   a=sc.nextInt();
  System.out.println("You have entered "+ a + " & here is the " + a  + " - 1 items displayed below in the reverse order")	;
for (int i=a; i>0;i--)
{ 
   if (i%2==0)  
  {    System.out.println(i + " is even number");
  }
else
{
  System.out.println(" Number "+ i + " is not even");
}
}
}
}