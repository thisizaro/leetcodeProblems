# Defanging an IP Address
# https://leetcode.com/problems/defanging-an-ip-address/description/

class Solution:
    def defangIPaddr(self, address: str) -> str:
        defanged_address = address.replace(".", "[.]")
        return defanged_address