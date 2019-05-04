import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2="";
      int k=0;
      int n=s1.length();
      for(int i=n-1;i>=0;i--)
      {
        char ch=s1.charAt(i);
        s2=s2+ch;
    } 
     for(int i=0;i<n;i++)
     {
       if(s1.charAt(i)==s2.charAt(i))
        k++;
          }
      if(k==n)
System.out.println("Yes");
     else
     System.out.println("No");
}
}