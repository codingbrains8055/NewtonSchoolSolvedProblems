static void SumAndMean(int arr[],int N){
  //Enter your code here 
  int sum = 0; 
  for(int i = 0; i < arr.length; i++){
    sum += arr[i];
  } 
  System.out.println(sum+" "+sum/N);
    }
