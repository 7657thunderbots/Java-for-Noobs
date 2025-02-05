import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRay{
    public static void main(String[] args){

    //      Array creation in java
    //int [] numbers = new int[10];
    //int[] numbers = {0,1,2,3,4,5,6,7,8,9};

    // ArrayList<Type> objectName = new ArrayList<Type>();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<String> students = new ArrayList<String>();

    System.out.print(students); //Array printed memory location
    // ADD Data to an ArrayList - add as many as YOU want, no predefintion limitations

    students.add("Kaden");
    students.add("Ethan");
    students.add("Joe-Mama");
    students.add("Deez");
    
    // READ data from an ArrayList
    System.out.print(students);

    //get one item
    System.out.println(students.get(1));
    

    //UPDATE data in our ArrayList
    students.set(0,"Steaven");
    // students.set(5,"Nuts"); //set does not add
    System.out.println(students);

    //DELETE data from out ArrayList
    students.remove("Deez");//finds the first occurence
    students.remove(1);
    System.out.println(students);

    students.clear();//clear the entire ArrayList


    //LENGTH of the list
    System.out.println(students.size());


    //Create obj and preload with data
    ArrayList<String> classroom = new ArrayList<String>(Arrays.asList("Joe","Deez","Dem","Mama"));

    //print each object in classroom
    for(int i = 0; i<classroom.size(); i++){
        classroom.get(i); // Array List version
        //classroom[i] Array version
    }
    
    //An ArrayList of ArrayList of Strings called board
    ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("1","2","3"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("4","5","6"));
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("7","8","9"));
        board.add(row1);
        board.add(row2);
        board.add(row3);

        System.out.println(board);
        // 9 8 7
        // 6 5 4
        // 3 2 1
        for (int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                System.out.print(board.get(row).get(col)+"\s");
            }
            System.out.println();
        }



    





}

}