import java.util.*;
public class carry_sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		//int ans=n1+n2;
		int c=0,r1=0,r2=0,ans=0;
		while(n1>0 && n2>0)
		{
			r1=n1%10;
			r2=n2%10;
			ans=r1+r2;
			if(c>0)
			{
				ans=ans+1;
			}
			//System.out.println(ans);
			String a=String.valueOf(ans);
			if(a.length()>1)
			{
				c++;
				
			}
			n1=n1/10;
			n2=n2/10;
		}
		System.out.println("The sum of the carry is");
		System.out.println(c);
	}
}
