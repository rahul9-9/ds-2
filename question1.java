import java.util.*;
class palindrome
{
 public static boolean check(String p)
 {
  if(p.length()==0 || p.length() ==1)
    {
    return true;
    }
  if(p.charAt(0)==p.charAt(p.length()-1))
   {
    return check(p.substring(1,p.length()-1));
   }
   return false;
 }

	public static void main(String[] args)
  {
  	Scanner in=new Scanner(System.in);

    String p=in.nextLine();
    if(check(p))
    {
      System.out.println(p+" is a palindrome.");
    }
    else
    {
      System.out.println(p+" is not a palindrome.");
    }
  }
}