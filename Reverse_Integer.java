class Solution {
    public int reverse(int x) {
    long num=0;
    while(x!=0){
       int rem=x%10;
        num=num*10+rem;
        x=x/10;
    }
    if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
        num=0;
    }
    return (int)num;

    }
}
