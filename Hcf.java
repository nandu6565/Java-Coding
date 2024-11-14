import java.util.Scanner;

public class Hcf {
    
    public static  int hcf(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1= n1%n2;
            }
            else{
                n2= n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }else{
            return n1;
        }
    }
    public static void main(String[] args) {
        Hcf c = new Hcf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n1: ");
       
        int n1 = sc.nextInt();
        System.out.print("Enter number n2: ");
        int n2 = sc.nextInt();
        System.out.println("Hcf of number" + n1+ " and "+ n2+ " is "+ hcf(n1,n2));
    }
}
