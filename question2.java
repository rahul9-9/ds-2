import java.util.*;
class Togglecase
{
	public static void main(String[] args)
	{
		Scanner g=new Scanner(System.in);
        String s=g.nextLine();
		char[] c=s.toCharArray();
		int i;
		for(i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
			{
				c[i]=Character.toLowerCase(c[i]);
				System.out.print(c[i]);
			}
            else if(Character.isLowerCase(c[i]))
            {
                c[i]=Character.toUpperCase(c[i]);
                System.out.print(c[i]);
            }
        }
	}
}