class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int flag=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                flag=0;
            }else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            return true;
        }else{
            return false;
        }
    }
}
