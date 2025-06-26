import java.util.Scanner;
class PasswordChecker
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		System.out.println(isValid(password));
	}
	public static boolean isValid(String password)
	{
		int len=password.length();
		int u=0,l=0,s=0,d=0;
		if(len<8)
		{
			return false;
		}
		else if(len>=8)
		{
			for(int i=0;i<len;i++)
			{
				char ch=password.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					u++;
				}
				else if(ch>='a' && ch<='z')
				{
					l++;
				}
				else if(Character.isDigit(ch))
				{
					d++;
				}
				else if(!Character.isLetterOrDigit(ch))
				{
					s++;
				}
			}
		}
		if((u>=1) && (l>=1) && (d>=1) && (s>=1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
					
					
		
		