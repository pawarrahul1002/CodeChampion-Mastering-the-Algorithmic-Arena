package com.target20.dsa;

public class CheckPalindromicArray {

	static boolean isPalindrome(int n) {
		String num = ""+n;
		int nLength = num.length();
		for(int i=0; i<num.length()/2; i++)
		{
			if(num.charAt(i)!= num.charAt(nLength-i-1))
			{
				return false;
			}
		}
		
		return true;
	}
	
    public static int palinArray(int[] a, int n)
    {
        for(int i=0; i<a.length; i++)
        {
          if(!isPalindrome(a[i]))
          {
              return 0;
          }
        }
        
        return 1;
    }
    public static void main(String[] args) {
		System.out.println(isPalindrome(4894));
	}
}
