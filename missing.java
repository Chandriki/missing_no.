class Solution {
    public int missingNumber(int[] nums) {
       /* int i=0,j=0;
        int n=nums.length+1;
        while(i<=n)
        {
            if(nums[j]!=i && j==(n-2))
            {
                return i;
            }
            else if(nums[j]!=i)
            {
                j++;
            }
            else if(nums[j]==i)
            {
                i++;
                j=0;
            }
        }
        return 0;*/
        int sum=0,asum=0;
        int n=nums.length;
        sum=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++)
        {
            asum+=nums[i];
        }
       
        return sum-asum;
    }
}