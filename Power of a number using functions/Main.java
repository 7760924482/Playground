import java.util.Scanner;
import java.lang.Math;
class Main
{
public static void main (String[] args)
{
Scanner in =new Scanner(System.in);
  int n=in.nextInt();
  int m=in.nextInt();
  int c;
  c=(int)Math.pow(n,m);
  System.out.println(c);
}
}