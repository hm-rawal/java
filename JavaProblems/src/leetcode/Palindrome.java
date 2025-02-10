package leetcode;

import java.awt.DisplayMode;

public class Palindrome {

	//Leetcode problem URL: https://leetcode.com/problems/palindrome-number/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-121));
	}
	
    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int left=0, right = value.length() - 1;
        while(left<right){
            if(value.charAt(left)!=value.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
