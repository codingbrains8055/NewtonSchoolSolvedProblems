static boolean isArmstrong(int N)
    {
        // your code here
        int temp = N;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            sum += (digit*digit*digit);
        }
        if(sum == N){
            return true;
        }
        return false;
    }
