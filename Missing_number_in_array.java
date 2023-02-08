// Missing number in array GFG
class Solution {
    int MissingNumber(int array[], int n) {
      int [] arr =new int[n+1];
      int z=0;
      for(int i=0;i<array.length;i++){
          ++arr[array[i]];
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0)
            z=i;
       
      }
      return z;
    }
}
