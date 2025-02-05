import java.util.Scanner;

public class MathEnStuff{
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        System.out.print("What is your hourly rate? ");
        double hourlyWage = ui.nextDouble();
        double income = hourlyWage * 2000;
        System.out.printf("You make: $%.2f%n", + income);
        ui.close();


      
        Math.pow(2,2);
        int x1,x2,y1,y2;
        x1=0;
        x2=4;
        y1=0;
        y2=4;

        //distance formula
        double preAnsX=Math.pow(2,(x2-x1));
        double preAnsY=Math.pow(2,(y2-y1));
        double ans = Math.sqrt((preAnsX)+(preAnsY));
        System.out.print(ans);
        System.out.println(Math.sqrt((Math.pow(2,(x2-x1)))+(Math.pow(2,(y2-y1))))); // same as ans









    }
}