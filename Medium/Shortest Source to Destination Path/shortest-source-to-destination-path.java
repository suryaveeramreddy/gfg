//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


// User function Template for Java
class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        Queue<ArrayList<Integer>> q=new LinkedList<>();
        int[][] vis=new int[N][M];
        ArrayList<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        q.add(a);
        int c=0;
        while(q.size()!=0)
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                ArrayList<Integer> b=q.poll();
                int x=b.get(0);
                int y=b.get(1);
                int d=b.get(2);
                if(x==X && y==Y)
                {
                    return d;
                }
                if(x-1>=0 && x-1<N && y>=0 && y<M && vis[x-1][y]==0 && A[x-1][y]==1 && vis[x-1][y]==0)
                {
                    ArrayList<Integer> b1=new ArrayList<>();
                    b1.add(x-1);
                    b1.add(y);
                    b1.add(d+1);
                    vis[x-1][y]=1;
                    q.add(b1);
                }
                if(x+1>=0 && x+1<N && y>=0 && y<M && vis[x+1][y]==0 && A[x+1][y]==1 && vis[x+1][y]==0)
                {
                    ArrayList<Integer> b1=new ArrayList<>();
                    b1.add(x+1);
                    b1.add(y);
                    b1.add(d+1);
                    vis[x+1][y]=1;
                    q.add(b1);
                }
                if(x>=0 && x<N && y-1>=0 && y-1<M && vis[x][y-1]==0 && A[x][y-1]==1 && vis[x][y-1]==0)
                {
                    ArrayList<Integer> b1=new ArrayList<>();
                    b1.add(x);
                    b1.add(y-1);
                    b1.add(d+1);
                    vis[x][y-1]=1;
                    q.add(b1);
                }
                if(x>=0 && x<N && y+1>=0 && y+1<M && vis[x][y+1]==0 && A[x][y+1]==1 && vis[x][y+1]==0)
                {
                    ArrayList<Integer> b1=new ArrayList<>();
                    b1.add(x);
                    b1.add(y+1);
                    b1.add(d+1);
                    vis[x][y]=1;
                    q.add(b1);
                }
            }
        }
        return(-1);
        
    }
}