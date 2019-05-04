import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int fact=1,orginal,i,v,sum=0;
      orginal=num;
      while(num>0)
      {
        v=num%10;
        fact=1;
      for(i=1;i<=v;i++)
      {
fact=fact*i;
	}
        sum=sum+fact;
        num=num/10;
      }
      if(sum==orginal)
      {
System.out.println("Yes");
      }
else
  System.out.println("No");
                    
}
}