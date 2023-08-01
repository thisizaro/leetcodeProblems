# 20. Valid Parentheses

class Solution:
    def isValid(self, s: str) -> bool:
        # Define a mapping of opening brackets to their corresponding closing brackets
        bracket_map = {
            '(': ')',
            '[': ']',
            '{': '}'
        }

        # Initialize an empty stack to store opening brackets
        stack = []

        # Loop through each character in the input string
        for char in s:
            # If the character is an opening bracket, push it onto the stack
            if char in bracket_map:
                stack.append(char)
            else:
                # If the character is a closing bracket, check if it matches the top element of the stack
                if not stack or bracket_map[stack.pop()] != char:
                    # If not, the input string is invalid
                    return False

        # If there are still elements left in the stack, the input string is invalid
        return len(stack) == 0
