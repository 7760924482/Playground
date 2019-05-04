import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,space,k=1;
      for(i=1;i<=n;i++)
      {
for(space=1;space<=n-i;space++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(k++ +" ");
}
        System.out.print("\n");
      }
    }    
}