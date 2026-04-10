class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0, high = letters.length - 1;
        int found = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                found = mid;        // 🔹 possible answer
                high = mid - 1;     // 🔹 try smaller index
            } 
            else
                low = mid + 1;      // 🔹 move right
        }

        // 🔹 wrap-around case
        if (found == -1) return letters[0];

        return letters[low];
    }
}