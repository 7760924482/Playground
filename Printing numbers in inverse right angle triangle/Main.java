import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=0;i<n;i++)
      {
for(j=n-i;j>=1;j--)
{
System.out.print(j);
}
        System.out.print("\n");
	}
}
}