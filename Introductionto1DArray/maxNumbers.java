import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int first = Integer.MIN_VALUE;
            int second = first;
            int third = second;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= first) {
                    third = second;
                    second = first;
                    first = arr[i];
                } else if (arr[i] < first && arr[i] >= second) {
                    third = second;
                    second = arr[i];
                } else if (arr[i] >= third && arr[i] < second && arr[i] < first) {
                    third = arr[i];
                }
            }
            System.out.println(first + " " + second + " " + third);
            T--;
        }
    }
}