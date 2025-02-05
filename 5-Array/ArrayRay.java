    import java.util.Scanner;
    public class ArrayRay {

        public static void main(String[]args){
            /*
            * Primitive - double, char, int, booleans
            * Non-Primitive - Strings, Lists, Arrays, ArrayList, Objects, Maps, Json, Humans
            * 
            * Sequences - mutilpe piece of data spliced together
            *      - String
            *      - Arrays
            *      - ArrayList
            *      - Maps, Json, List, Collections, Tuples
            *      - Linked List 
            */
            //array data type is immutable as it cannot change length or data after created.
            
        //    int[] listy = {   0,1,2,3,4,5,6,7,8,9};
        //     //int[] numbers = {0,1,2,3.14,4,5};
        //    //int[] objectName = {} you just said this array is filled with in
        //    double[] doublenumbers = {0,1,2,3.14,4,5};
        //    String[] words = {"Hello", " ","World", "4"};
        //    char[] alpha = {'a','b','c'};

        //     System.out.println(listy);
        //     System.out.println(doublenumbers);
        //     System.out.println(words);
        //     System.out.println(alpha);
            
                // Grocery List
            String[] cart = new String[5];
            double[] cost = new double[5];

                //add an item
            cart[0] = "bannana";
            cart[1] = "apple";
            cart[2] = "android";
            cart[3] = "cake";
            cart[4] = "calculator";

            Scanner ui = new Scanner(System.in);
            for (int i = 0; i < cost.length; i++){
                cost[i]=ui.nextDouble();
            }

            printHorizontal(cart);
            printVertical(cart);

            //remove an item from an array
            cart[2]=null;

            //update an item from an array
            cart[2]="Attack Helicopter";

            //increase the cart size - typically in a f(x)    
            String[] newCart = new String[cart.length+1]; //you could Memmory Leak like a bozo
            //now move the old cart to the new
            for(int i = 0; i < cart.length; i++){
                newCart[i]=cart[i];
            }


        }

        private static void printHorizontal(String[] arr){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"\s");
            }
            System.out.println();

            //Grid of number -> nest Arrays
            /*
            *      [[1, 2],
            *       [3 , 4]]
            */
            int [][] grid = {
                {1,2},
                {3,4}
            };
            //item row 2 col 2
            int r2c2 = grid[1][1];

            //if you want to print all of the items
            for(int r=0; r<grid.length; r++){
                for (int c = 0; c < grid[r].length; c++){
                    System.out.println(grid[r][c]);
                }
            }
        }
        private static void printHorizontal(int[] arr){
            for (int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+"\s");
            }
            System.out.println();
        }
        private static void printVertical(int[] arr){
            for(int i =0; i<arr.length;i++){
                System.out.print(arr[i]+"\s");
            }
            System.out.println();
        }
        private static void printVertical(String[] arr){
            for(int i =0; i<arr.length;i++){
                System.out.print(arr[i]+"\n");
            }
            System.out.println();
        }   



    }