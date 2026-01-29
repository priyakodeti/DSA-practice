//Problem: Count ways to reach nth stair with 1 or 2 steps using DP 

import java.util.*;
class NthStair
{
	public static int countWays(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else
			return countWays(n-1)+countWays(n-2);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=countWays(n);
		System.out.print(res);
	}

}
