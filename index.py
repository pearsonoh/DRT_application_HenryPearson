class Solution:
    ## This function takes a Roman numeral string as input and returns the equivalent Arabic numeral as an integer as output. 
    ## Time complexity: O(n) worst case runtime 
    def romanToInt(s: str) -> int:
        prev = ''
        count = 0
        numeralDict = {'I' : 1, 'V': 5, 'X':10, 'L':50, 'C':100,'D':500, 'M':1000} 
        for a in s:
            if prev != '':
                count += numeralDict[prev] if numeralDict[a] <= numeralDict[prev] else -1 * numeralDict[prev]
            prev = a
        return count + numeralDict[prev]