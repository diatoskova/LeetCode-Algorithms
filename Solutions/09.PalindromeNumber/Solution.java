public class Solution {

    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        long reversedNumber = 0;
        while (x != 0)
        {
            int last_digit = x % 10;
            reversedNumber = reversedNumber * 10 + last_digit;
            x = x / 10;
        }
        return reversedNumber == x;
    }
}
