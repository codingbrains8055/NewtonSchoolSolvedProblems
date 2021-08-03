#include <stdio.h> // header file for Standard Input Output
#include <stdlib.h> // header file for Standard Library

int main() {

	//Your code here
	int negative = 0, N,i;
	scanf("%d",&N);
	int arr[N];
	for(i = 0; i < N; i++){
		scanf("%d",&arr[i]);
	}
	for(i = 0; i < N; i++){
		if(arr[i] < 0){
			negative = 1;
		}
	}	
	if(negative){
		printf("Yes");
	}else{
		printf("No");
	}
	return 0;
}
