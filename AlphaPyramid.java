
import java.util.Scanner;

public class AlphaPyramid {
    

    static void printPattern(int n){
        for(int i=0;i<n;i++){
            int ch = 65;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" "); 
            }
            for( int k=0;k<=i;k++){
                System.out.print((char)(ch+k));
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n:");
        int n = sc.nextInt();
        printPattern(n);
    }
}
