import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < N; j++) {
                    if (arr[minIndex] > arr[j]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            T--;
        }
    }
}
