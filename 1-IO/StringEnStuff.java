public class StringEnStuff{
    /*
 * Data Types
 * 
 *      Primitive - initial or the first - boolean, integers, characters, double/float
 *                                         boolean, int,      char,       double      
 *      Non-Primitive - non native - Strings, Arrays, Arrays, ArrayList, List
 * 
 *  #1 way to tell if it is pri/non-pri is the Capitalization 
 * 
 * String name = "bob";     -> name is not a var, it is an object
 * int x = 4;   -> x is now the object x
 * 
 * 
 */
    int x = 4; //int is primititve 
    Integer x2 = 4; //Integer is non-primitive

    double gpa = 4.0;
    Double gpa2 = 4.0;

    public static void main(String[] args){
        String name = "Tim";// use double quotes "" - these are for strings
        char letter = 'T'; //use single quotes '' - these are for characters


        int age = 40;
        boolean old = true;
        double pi = 3.14;
        float fpi = 3.14f;

        String email = "timyourmomlovesyou@gmail.com";
        String password = new String();
        password = "noshedoesnt:(";
        
        //first I want the username - grab everything up to the @ sign
        //substring() -> grabs a sub portion of string 
        String username = email.substring(0,18);
        String domain = email.substring(19);
        System.out.println(username);
        System.out.println(domain);


        



        
    
    }



}