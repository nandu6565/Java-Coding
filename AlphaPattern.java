import java.util.Scanner;

public class AlphaPattern {
        static void printPattern(int N){
            for (int i = 0; i < N; i++)
        {

            int ch =65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print( (char)(ch+j)+" ");
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
