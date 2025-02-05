import java.util.Scanner;

public class FunFunc {
    
    public static void main (String[] args){
        //Abstraction - say jump() and a lot things happen
        
        // add(2,2);       //say add, give 2 numbers, print out the results
        
        // check if user typed in a corre t formatted email - only need @ symbol
        Scanner ui = new Scanner (System.in);
        String email = ui.nextLine();
        String username = validEmail(email);
    }
    private static String validEmail(String e){
        Scanner ui = new Scanner(System.in);  
        while(!e.contains("@")){
            e = ui.nextLine();
        }
        ui.close();
        System.out.println("Hello! " +e.substring(0, e.indexOf("@")));
        return e.substring(0, e.indexOf("@"));
    }
    private static void add(int a, int b){
        System.out.println(a+b);
    
    }private static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    /*
     * Rule of Thumbs for f(x)
     *      who needs access to the method?     public or private
     *      Do I need an object to use this method? static or non-static 
     *      Will I have different data types or give data back
     *      
     *         methods and functions are verbs
     *              names of function shouldn't be nouns
     * 
     * 
     * 
     * 
     */




     private static String convertMyNumberToMoney(int m){
        return "$"+m+.00;
    }

    private static String convertMyNumberToMoney(double m){
        return "$"+m;
    }





    
    /*
    * synchronous programing - Python or Bash => start line 1 and go to the end
    * asynchronous programing - Java => compile everything and run things "whenever"   
    */

    /* 
    *private vs public  
    *       - private -> can only be access in the scope that it is defined in 
    *           For example,add (int a, int b) can only be used in the FunFunc class
    *       - public -> can be accessed by other classes in the program
    *            For example, public static void main(String[] args) is public for every 
    *                class to access to run the start situation
    *
    *static vs non-static
    *       - static -> function or method that can be ran without an object
    *       - non-static -> requires an object to do
    *
    *
    *void vs Data Type 
    *       - void function means that the function is not returning information back
    *        into the line of code the function was called in
    *           email.substring(0,email.indexOf("@"));
    *               indexOf returns the position of @
    *           email.substring(0,8);
    *       - Data Type -> what is the type of date you are returning 
    *
    */


}