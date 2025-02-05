import java.util.Scanner;


public class Battle {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        //Build Pokemon
        Pokemon myPokeMan = new Pokemon("3", "Steel", 180, "Aluminum Falcon", "36in", "125lbs", "Shooter", 160, "Bump and Run", 80, "selfie");
        Pokemon xaversBud = new Pokemon("0","Steel", 1, "C++", "19in", "1lbs", "Erm... Actually ☝️🤓!", 0, "Programing Video", 10, "joe");

        //Welcome to the battle 
        System.out.println("A random trainer has challenged you!");
        //Your pokemon: <poke name> Hp: <poke hp>
        System.out.println("Your Pokemon:" +myPokeMan.getName() +"\n\tHP:" + myPokeMan.getHp());
        System.out.println("Trainer's Pokemon:" +xaversBud.getName() +"\n\tHP:" + xaversBud.getHp());

        //Battle Loop
        while(myPokeMan.getHp()>0 && xaversBud.getHp()>0){
            System.out.println("\nChoose an attack");
            System.out.println("1. " + myPokeMan.getAttack1Name()+"\tDamage: " + myPokeMan.getAttack1Damage());       
            System.out.println("2. " + myPokeMan.getAttack2Name()+"\tDamage: " + myPokeMan.getAttack2Damage()); 
            String choice = ui.next();
            int damage = 0;
            //Attack Switch Statement - this is a conditional loop aka glorified if statement loop
            switch(choice){
                case "1":
                    damage = myPokeMan.getAttack1Damage();
                    System.out.println(myPokeMan.getName()+" used : " + myPokeMan.getAttack1Name());
                    break;
                case "2":
                    damage = myPokeMan.getAttack2Damage();
                    System.out.println(myPokeMan.getName()+ "used : " + myPokeMan.getAttack2Name());
                    break;
                default:
                    System.out.println("You lose a turn!");
                    continue;
            }
        //Apply damage
        xaversBud.setHp(xaversBud.getHp() - damage);
        System.out.println("Trainer's Pokemon: " + xaversBud.getName()+"\n\t\t HP: " + xaversBud.getHp());

        //check if it dead
        if(xaversBud.getHp()<=0){
            System.out.println(xaversBud.getName() + " fainted!");
            break;
        }
            
        }
    }
}