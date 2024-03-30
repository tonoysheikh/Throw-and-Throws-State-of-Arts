
package su.throwcode;

import java.util.Scanner;

class validation {
    void ck(int age) throws ArithmeticException
    {
        
        if(age < 18)
        {
            throw new ArithmeticException("Person is not eligible to vote");   
        }
        else
        {
            System.out.println("adult");
        }
    }
}

public class agevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        
        validation va = new validation();
        try{
             va.ck(age);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
        
    }
  
}
