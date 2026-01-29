import java.util.*;
class ReachNthStair3
{
	public static int countWays(int n)
	{
		if(n==1)		
			return 1;
		if(n==2)
			return 2;
		
		int[] dp=new int[n+1];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4;i<=n;i++)
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		return dp[n];
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=countWays(n);
		System.out.print(res);
	}
}