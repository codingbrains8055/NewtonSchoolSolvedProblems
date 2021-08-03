import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer;
        if (N % 3 == 0 || N % 3 == 1) {
            answer = N / 3;
        } else {
            answer = N / 3 + 1;
        }
        System.out.println(answer);
    }
}
