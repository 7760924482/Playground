import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
  	String s1=in.nextLine();
    String s2=in.nextLine();
    String s3="";
    int n=s1.length();
    int m=s2.length();
    int k=0;
    for(int i=0;i<m;i++)
    {
      s3=s1.substring(i,m+i);
      if(s3.charAt(i)==s2.charAt(i))
      {
		k++;
      }
    }
    if(k==1)
      System.out.println(k+2);
    else
      System.out.println(k);
  } 
}