
package su.throwcode;

import java.util.Scanner;

class valid{
    void ck(int num)
    {
        try{
            if(num < 0)
            {
                throw new ArithmeticException("Not a positive Number");
            }
            else
            {
                System.out.println("Valid positive Number");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class positiveValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a interger number : ");
        int num = sc.nextInt();
        
        valid va = new valid();
        va.ck(num);
    }
}
