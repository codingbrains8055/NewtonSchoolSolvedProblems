import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean possible = true;
        boolean stop = false;
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int divisor = 1;
        for (int i = 0; i < N; i++) {
            while (divisor <= arr[i]) {
                if (arr[i] % divisor == 0) {
                    arr[i] = divisor;
                }
                divisor++;
            }
            // printArr(arr);
        }
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                possible = false;
                break;
            }
        }
        // System.out.println(divisor);
        sc.close();
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
