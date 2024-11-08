import java.util.Scanner;

public class Pattern3 {
    static void printPattern(int N){
        for (int i = 1; i <= N; i++)
        {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j + "");
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
