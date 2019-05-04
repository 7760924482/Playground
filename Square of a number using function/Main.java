import java.util.Scanner;
class Main
{
  public static int mul (int n)
  {
   int l;
    l=n*n;
    return l;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new  Scanner(System.in);
      int n=in.nextInt();
      int k;
      k=mul(n);
      System.out.println(k);
    } 
}