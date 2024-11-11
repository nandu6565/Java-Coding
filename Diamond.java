import java.util.Scanner;

public class Diamond {
    
static void printPattern(int n){
        for(int i=0;i<n;i++){
            for (int j =0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }

        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        System.out.println();
        }
        for(int i =n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");

            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        printPattern(n);
    }
    
}
