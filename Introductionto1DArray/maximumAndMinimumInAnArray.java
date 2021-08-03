import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int size;
        while (T > 0) {
            size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int min = arr[0], max = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.print(max + " " + min);
            System.out.println();
            T--;
        }
    }
}
