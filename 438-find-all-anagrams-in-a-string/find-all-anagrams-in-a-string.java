import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), k = p.length();
        if (k > n) return new ArrayList<>();

        int[] p_freq = new int[26];
        int[] s_freq = new int[26];

        for (int i = 0; i < k; i++) {
            p_freq[p.charAt(i) - 'a']++;
            s_freq[s.charAt(i) - 'a']++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = k; i <= n; i++) {
            if (Arrays.equals(p_freq, s_freq)) {
                result.add(i - k);
            }

            if (i < n) {
                s_freq[s.charAt(i) - 'a']++;
                s_freq[s.charAt(i - k) - 'a']--;
            }
        }

        return result;
    }
}