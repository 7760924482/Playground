import java.util.Scanner;
public class Main{
  public static int gt(int a,int b,int c)
  {
    int gcd=1,min;
      if(a<b&&a<c)     
		min=a;
    else if(b<c)
		min=b;
	else
		min=c;
    while(min>=1)
    {
	if((a%min==0)&&(b%min==0)&&(c%min==0))
    {
		gcd=min;
        break;
    }
    }
      return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int k;
      k=gt(n1,n2,n3);
      System.out.println(k);
	}
}