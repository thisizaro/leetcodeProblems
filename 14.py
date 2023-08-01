# 14. Longest Common Prefix 

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        # Find the minimum length string in the array
        min_len = min(len(s) for s in strs)

        # Initialize the result as an empty string
        result = ""

        # Loop through each character position up to the minimum length
        for i in range(min_len):
            # Get the current character at position i in the first string
            char = strs[0][i]

            # Check if all other strings have the same character at position i
            if all(s[i] == char for s in strs):
                # If all strings have the same character at position i, add it to the result
                result += char
            else:
                # If any string differs at position i, break out of the loop
                break

        return result
