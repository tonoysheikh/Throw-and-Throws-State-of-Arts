
package su.throwcode;

import java.util.Scanner;

class valid{
    void ck(int num) throws ArithmeticException
    {
        if(num < 0)
        {
            throw new ArithmeticException("Not a positive Number");
        }
        else
        {
            System.out.println("Valid positive Number");
        }
    }
}

public class positiveValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a interger number : ");
        int num = sc.nextInt();
        
        valid va = new valid();
        try{
            va.ck(num);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
