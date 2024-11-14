
import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors {

    public static ArrayList<Integer> findDivisors(int n){

        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1;i<= Math.sqrt(n);i++){
            if(n%i == 0){
                divisors.add(i);

                if( n/i != i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n: ");
        int n = sc.nextInt();
        ArrayList<Integer> divisors = findDivisors(n);

        System.out.print("Divisors of " + n + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        sc.close();

    }
}
