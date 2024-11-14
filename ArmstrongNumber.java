
import java.util.Scanner;

public class ArmstrongNumber {
    
    static boolean checkArmstrongNumber(int n){
        int k = String.valueOf(n).length();
        int sum =0;
        int num =n;
        while(n>0){
            int ld = n%10;
            sum += Math.pow(ld,k);
            n = n/10;
        }
        return  sum ==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n: ");
        int n = sc.nextInt();
        if(checkArmstrongNumber(n)){
            System.out.println("Given number " + n+ " is Armstrong Number");
        }else{
            System.out.println("Given number " + n+ " is not an Armstrong Number");

        }
        sc.close();
    }
}
