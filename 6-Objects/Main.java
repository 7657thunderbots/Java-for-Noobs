public class Main {
    public static void main(String[] args){
        String strObj = new String();
        String strObj2 = "Xaver";

        //DataType objName = new Constructor();
        Pokemon testPokeMan = new Pokemon();
        Pokemon myPokeMan = new Pokemon("3", "Steel", 180, "Aluminum Falcon", "36in", "125lbs", "Shooter", 160, "Bump and Run", 80, "selfie");
        Pokemon xaversBud = new Pokemon("0","Steel", 1, "C++", "19in", "1lbs", "Erm... Actually ☝️🤓!", 0, "Programing Video", 10, "joe");

        System.out.println(xaversBud);
        System.out.println(myPokeMan);

        testPokeMan.setName("Snorlax");
        testPokeMan.setId("400");
        testPokeMan.setAttack1Name("Yawn");
        testPokeMan.setAttack1Damage(0);
        testPokeMan.setAttack2Name("Sleepy Face");
        testPokeMan.setAttack2Damage(10);
        System.out.println(testPokeMan);
        
    }
}