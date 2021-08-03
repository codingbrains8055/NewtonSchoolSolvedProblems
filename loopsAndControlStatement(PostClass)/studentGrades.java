static char grades(int a, int b, int c, int d, int e)
    {
      // Your code here
      int percent = (a + b + c + d + e)*100/500;
      if(percent >= 80){
        return 'A';
      }
      if(percent >= 60 && percent < 80){
        return 'B';
      }
      if(percent >= 40 && percent < 60){
        return 'C';
      }
      return 'D';
     }
