public class Solution {
    public int reverse(int x) {
        long reversedNumber = 0;
        while (x != 0)
        {
            int last_digit = x % 10;
            reversedNumber = reversedNumber * 10 + last_digit;
            x = x / 10;
        }
        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
            reversedNumber = 0;
        }
        return (int)reversedNumber;
    }
}
