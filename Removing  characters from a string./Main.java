import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String a=in.nextLine();
    String b=in.nextLine();
    StringBuilder sb1=new StringBuilder(a);
    StringBuilder sb2=new StringBuilder(b);
    for(int i=0;i<a.length();i++)
    {
		for(int j=0;j<b.length();j++)
        {
          if(sb1.charAt(i)==sb2.charAt(j))
          {
            sb1.setCharAt(i,'$');
          }
        }
    }
    for(int i=0;i<a.length();i++)
    {
      if(sb1.charAt(i)!='$')
      System.out.print(sb1.charAt(i));
                       }
  }
}