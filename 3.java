class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128]; // Assuming ASCII characters
        
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(charIndex[c], left); // Move the left pointer to the right of the last occurrence of the character
            maxLength = Math.max(maxLength, right - left + 1); // Update the maximum length
            charIndex[c] = right + 1; // Update the index of the character
        }
        
        return maxLength;
    }
}
