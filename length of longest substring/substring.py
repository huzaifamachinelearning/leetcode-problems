class Solution(object):
  def lengthOfLongestSubstring(self,s):
    
    blocks=[]
    block=""
    for element in  s:
        if element not in block:
            block+=element
        else:
            blocks.append(block)
            block=""
            block+=element
    blocks.append(block)
    
    if len(blocks)==1:
        return len(blocks[0])
    
    max_len=0
    for i in range(len(blocks)-1):
        c=blocks[i]+blocks[i+1]
        for l in range(len(c)):
            for m in range(l+1,len(c)+1):
                k=c[l:m]
                s=set(k)
                if len(k)==len(s):
                    if len(k)>max_len:
                        max_len=len(k)
    
    
    return  max_len
        



    
    
s=input("enter your string ")
sol=Solution()
l=sol.lengthOfLongestSubstring(s)
print(f"lenght of longest substring is {l}")