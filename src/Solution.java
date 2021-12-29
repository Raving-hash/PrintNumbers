class Solution {
    public int[] printNumbers(int n) {
        int maxnum = (int) (Math.pow(10,n) - 1);
        int[] res = new int[maxnum];
        for (int i = 1; i <= maxnum; i++){
            res[i-1] = i;
        }
        return res;
    }
}