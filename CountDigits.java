
import java.util.Scanner;

public class CountDigits {
    
    public int countDigits(int number) {
        int count = (int)(Math.log10(number)+1);
        return count;
    }

    public static void main(String[] args) {
        CountDigits counter = new CountDigits();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number n: ");
        int number = sc.nextInt();
        System.out.println("The number of digits in " + number + " is " + counter.countDigits(number));
    }
}
