import java.util.Scanner;

/**
 * Created by rogi on 1/18/16.
 */
public class SumOf_N_numbers {

    public static void main(String[] args){
        int N;
        MathOperations mo = new MathOperations();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        N = scan.nextInt();
        if (N > 0) {
            mo.setNumber(N);
            mo.setOperationType("sum");
            mo.performOperation();
            System.out.println("Sum is: " + mo.getResult());
        }else if (N <= 0){
            System.out.println("Value should be > 0");
        } else {
            //if (N  (int)N) {
            System.out.println("Its not an Integer");
        }




    }
}
