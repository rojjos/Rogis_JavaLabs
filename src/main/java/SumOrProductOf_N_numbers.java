import java.util.Scanner;
import java.util.*;
/**
 * Created by rogi on 1/18/16.
 */
public class SumOrProductOf_N_numbers {
    public static void main(String[] args) {
        int N;
        String strN;
        String ValidOperationType;

        MathOperations mop = new MathOperations();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        N = s.nextInt();

        /*mop.setNumber(N);
        mop.getNumber();
        mop.setOperationType("sum");
        mop.getOperationType();
        mop.performOperation();
        System.out.println("Sum is : " + mop.getResult());*/

        if (N > 0) {
            //Getting the Math operation
            System.out.print("Enter the valid Operation Type : ");
            strN = s.next();
            // setting and getting the N value
            mop.setNumber(N);
            mop.getNumber();
            // checking the operation type
            if (mop.setOperationType(strN)){
                mop.getOperationType();
                if (mop.getOperationType().equals("sum"))
                    {    mop.performOperation();
                        System.out.println("Sum is : "+ mop.getResult());
                    }
                else if (mop.getOperationType().equals("product")){
                        mop.performOperation();
                        System.out.println("Product is : "+ mop.getResult());
                }
                else {
                    System.out.println(mop.getValidOperationType());
                }

           }
        }else if (N <= 0){
            System.out.println("Value should be  > 0 ");
        }
        //Need a string checking  for N here
        // else {
           // System.out.println(mop.getValidOperationType());
        //}

    }

    }



