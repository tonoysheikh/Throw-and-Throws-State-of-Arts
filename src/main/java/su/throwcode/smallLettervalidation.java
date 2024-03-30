
package su.throwcode;

import java.util.Scanner;

class ck {
    void check(char c)throws ArithmeticException {
        
        if (c >= 'A' && c <= 'Z') {
            throw new IllegalStateException("Small letter not found");
        } 
        else {
            System.out.println("Small letter found");
        }
       
    }
}
public class smallLettervalidation {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        
        ck validator = new ck();
        try{
           validator.check(c); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
 
}
