import java.util.Scanner;

public class Pattern5 {
    
    static void printPattern(int N){
        for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < 2*i; j++) {
            System.out.print(" ");
        }
        
        // Print stars
        for (int k = 0; k < N-i-1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        System.out.println("Enter Number N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPattern(N);
        sc.close();
    }
}
