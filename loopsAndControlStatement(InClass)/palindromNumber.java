static boolean isPalindrome(int N)
    {
       // your code here
       int temp = N;
       int rev = 0;
       while(temp > 0){
          int digit = temp%10;
          temp /= 10;
          rev = rev*10 + digit;
       }
       if(N == rev){
          return true;
       }
       return false;
    }
