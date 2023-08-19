#User function Template for python3

#Function to find a continuous sub-array which adds up to a given number.
#User function Template for python3

#Function to find a continuous sub-array which adds up to a given number.
class Solution:
    def subArraySum(self,arr, n, s): 
       #Write your code here
       d=dict()
       l=[]
       l.append(arr[0])
       for i in range(1,len(arr)):
           l.append(l[i-1]+arr[i])
       for i in range(len(l)):
           if(l[i]==s):
               return([1,i+1])
           d[l[i]]=i
           if(l[i]>s):
               if(l[i]-s in d):
                   if(i+1<d[l[i]-s]+2):
                       return([-1])
                   return([d[l[i]-s]+2,i+1])
       return([-1])
           
           


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

def main():
        T=int(input())
        while(T>0):
            
            NS=input().strip().split()
            N=int(NS[0])
            S=int(NS[1])
            
            A=list(map(int,input().split()))
            ob=Solution()
            ans=ob.subArraySum(A, N, S)
            
            for i in ans:
                print(i, end=" ")
                
            print()
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends