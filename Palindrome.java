
import java.util.Scanner;

public class Palindrome {
    
    public boolean isPalindrome(int n){

        int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        return original==reverse;

    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr number n: ");
        int n = sc.nextInt();
        if (p.isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }

        sc.close();
    }
}
