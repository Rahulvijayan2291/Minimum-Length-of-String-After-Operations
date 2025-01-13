class Solution {
    public int minimumLength(String s) {
        int[] freq = new int['a' + 26];
        for(byte c : s.getBytes()) freq[c]++;
        int res = 0;
        for(int i = 'a'; i < freq.length; i++){
            int c = freq[i];
            if(c == 0) continue;
            res += (c & 1 ^ 1) << 1 | c & 1;
        }
        return res;
    }
}
