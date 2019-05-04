import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int l=0;
for(int i=0;i<=n;i++)
{
  l=l+i;
}
    return l;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k;
      k=sum(n);
      System.out.println(k);
	}
}