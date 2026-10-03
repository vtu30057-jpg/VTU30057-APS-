class Solution {
    public int[] sortedSquares(int[] num) {
     int l=0;
     int r = num.length - 1;
     int i = num.length - 1;
     int[] res=new int[num.length];
     while(l<=r)
     {
        if(Math.abs(num[l])>Math.abs(num[r])){
        res[i]=num[l]*num[l];
        l++;
        }
        else
        {
            res[i]=num[r]*num[r];
            r--;
            }
            i--;
        }
    return res; 
    }
}       
    