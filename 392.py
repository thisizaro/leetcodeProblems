# 392. Is Subsequence

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        # Initialize pointers for both strings
        i, j = 0, 0

        # Iterate through both strings using pointers
        while i < len(s) and j < len(t):
            # If characters match, move the pointer for s to the next character
            if s[i] == t[j]:
                i += 1
            # Move the pointer for t to the next character regardless of match
            j += 1

        # If all characters in s have been processed (i == len(s)),
        # then s is a subsequence of t. Otherwise, it is not.
        return i == len(s)
