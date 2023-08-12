//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int [][] dp;
    static int recc(int i,int j,String s1,String s2)
    {
        if(i>=s1.length() || j>=s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+recc(i+1,j+1,s1,s2);
        return  dp[i][j]= Math.max(recc(i,j+1,s1,s2),recc(i+1,j,s1,s2));
        // dp[i][j];
    }
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        return(recc(0,0,s1,s2));
    }
    
}