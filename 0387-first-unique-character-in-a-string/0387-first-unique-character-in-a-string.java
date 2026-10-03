class Solution {
    public int firstUniqChar(String s) {
        int i, t;
        int[] h = new int[26];

        for (i = 0; i < s.length(); i++) {
            t = s.charAt(i) - 'a';
            h[t]++;
        }

        for (i = 0; i < s.length(); i++) {
            if (h[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;
    }
}