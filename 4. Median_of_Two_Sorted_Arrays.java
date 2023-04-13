import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[nums1.length+i]=nums2[i];
        }
        Arrays.sort(arr);
        int size=arr.length;
        double val=0;
        if(size%2==0){
           double num=size-1;
           num=num/2;
           int ceil=(int)Math.ceil(num);
           int floor=(int)Math.floor(num);
           val=(arr[ceil]+arr[floor])/2.0;
          
        }else{
            val=arr[(size-1)/2];
          
        }
    return val;
    }
}
