package palindrome09;

public class Solution {
    public static void main(String[] args){
        int number = 2147483647;
        boolean result = isPalindrome(number);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
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
