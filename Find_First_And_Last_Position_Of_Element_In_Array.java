//Leetcode=>  34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                flag=true;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                res[1]=j;
                flag=true;
                break;
            }
        }
        if(flag==true){
           return res;
        }
        else{
           res[0]=-1;
           res[1]=-1;
           return res;
    }
    }
}
