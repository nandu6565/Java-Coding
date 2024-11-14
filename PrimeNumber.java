
import java.util.Scanner;

public class PrimeNumber {
    
    static boolean checkPrime(int n){

        if (n < 2) {
            return false;
        }

        int cnt= 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){ 
                cnt = cnt+1;
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }
        return  cnt ==2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n: ");
        int n = sc.nextInt();
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();

    }
}
