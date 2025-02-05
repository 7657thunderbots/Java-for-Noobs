import java.util.Scanner;


public class Condish {
    public static void main(String[] args) {
        /*
         * if something
         * else if something
         * else
         */
        int x = 5;
        
        // At any point 3 or more possible outcomes, use this
        //There are 3 possible answers
        if (x==4){
            System.out.println(true);
        }else if(x==8){
            System.out.println("it equals 8");
        }else{
            System.out.println(x);
        }

        //There are 2 possible answers 
        if (x==4){
            System.out.println("they are the same");
        }else {
            System.out.println("they are not the same");
        }

        //There is only one answer 
        if (x==4){
            System.out.println("Do something");
        }
         /*
         * Logical Operator as in logic math as in equalitites 
         * > and < are the greater than and less than 
         * >= <= are the greater than or equal to and the less...
         * .equals() to check if two objects are the same - non-primitive
         * == checks if equal to - for primitive 
         * = one sign is assigning
         * ! this means BANG 
         * != this means not equal - for primitive
         * !hunter.equals(morgan) - for non-primitive
         * 
         */
        boolean y = true;
        if(y){ //do not do y == true
            System.out.println("this means y is true");
        }else{
            System.out.println("this means y is not true");
        }
        
        /*
         * Compount Conditional Operators
         * and - mean both too the left and right are true
         * or - means only one needs to be true
         */

         // build a conditional statement that if you put in an int, it will tell you the letter grade the student got

    }
}