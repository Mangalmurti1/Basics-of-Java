import java.util.*;
class whileloop
{
    public static void main(String args[])
{
   int a;
   Scanner sc=new Scanner (System.in);
  System.out.println("Enter the number");
  a=sc.nextInt();

while(a<=10 && a>0)
{
   System.out.println("Number : "+ a);
   a--;
}

}
System.out.println("Number is greater than 10");


}