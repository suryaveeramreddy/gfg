#User function Template for python3

class Solution:
    def maxOnes(self, a, n):
        # Your code goes here
        s=a.count(1)
        t=s
        m=s
        zc=0
        oc=0
        for i in range(len(a)):
            if(a[i]==0):
                zc+=1
                s+=1
            elif(a[i]==1):
                oc+=1
                s-=1
            if(oc>=zc):
                s=t
                oc=0
                zc=0
            else:
                if(s>m):
                    m=s
        if(s>m):
            m=s
        return m
        
        
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob=Solution()
        print(ob.maxOnes(a, n))

        T -= 1


if __name__ == "__main__":
    main()



# } Driver Code Ends