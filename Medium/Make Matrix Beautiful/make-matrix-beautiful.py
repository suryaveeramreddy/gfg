#User function Template for python3

class Solution:
    def findMinOpeartion(self, matrix, n):
        # Code here
        m=0
        r=[]
        c=[]
        for ele in matrix:
            if(sum(ele)>m):
                m=sum(ele)
            r.append(sum(ele))
        for i in range(len(matrix[0])):
            summ=0
            for j in range(len(matrix)):
                summ+=matrix[j][i]
            c.append(summ)
            if(summ>m):
                m=summ
        countt=0
        for i in range(n):
            for j in range(n):
                if(r[i]==m):
                    continue
                else:
                    maxx=max(r[i],c[j])
                    val=m-maxx
                    countt+=val
                    r[i]+=val
                    c[j]+=val
        return countt
            


#{ 
 # Driver Code Starts

#Initial Template for Python 3

for _ in range(int(input())):
    n = int(input())
    matrix = [list(map(int,input().split())) for _ in range(n)]
    ob = Solution()
    print(ob.findMinOpeartion(matrix, n))
# } Driver Code Ends