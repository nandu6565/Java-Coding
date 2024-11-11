
import java.util.Scanner;

public class AlphaSemiPyramid {

    static void printPattern(int n){
        int s = 2*(n-1);

        for(int i=1;i<=n;i++){
            int ch =65;
            for(int j=1;j<=i;j++){
                System.out.print((char)(ch+j-1));
            }
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                // System.out.print(j);
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
            s -=2;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    
}