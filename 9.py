# 9. Palindrome Numebr
class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Convert the integer to a string
        x_str = str(x)
        
        # Compare the original string with its reverse
        return x_str == x_str[::-1]
