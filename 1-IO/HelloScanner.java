//package
//import 
import java.util.Scanner;

public class HelloScanner{
    public static void main(String[] args){
    System.out.println("What's for lunch?");

    //anytime I need user input... do this...
    Scanner ui = new Scanner(System.in);
    String food = ui.nextLine(); //get the next line of input from user
    System.out.println("Wow! " +food+ " sounds Delish!");

    System.out.println("How much was it");
    String cost = ui.nextLine();
    System.out.println("Wow! " +cost+ " seems pretty cheap");
    System.out.println("Whats your favorite color?");
    String color = ui.nextLine(); 
    System.out.println(color + " thats a boring color!");

    ui.close();//best practice

    }      
}