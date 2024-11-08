import java.util.Scanner;

public class Pattern4 {
    
    static void printPattern(int N){
        for (int i = 0; i < N; i++)
    {
        for (int j = N; j > i; j--)
        {
            System.out.print(N-j+1 + " ");
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
