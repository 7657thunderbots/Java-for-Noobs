public class LoopsEnStuff {
    public static void main(String[] args){
        //two main loops to tackle... pretty much anything          FOR and WHILE
        //both loops are built from a conditional statment


        ////////////////////////////////////////    WHILE LOOPS          ///////////////////////////////////////////////////////////
        // iterator varible
        //while (condition is true){
            //do this algorithm 
            // iterate your iterator variable 
        // }
        
        //print out 0-9
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        int i2 = 0;
        while (i2<22){
            System.out.println(i2);
            i2+=2;
        }

        //print out 0-9 a different way... aka change your conditional statement
        //print out even numbers btwn 0-20
        //print out prime numbers btwn 0-1000
        //print out palindromes btwn 0-10,000
        //print out 1000 to -1000 by 50
        //print out alphabet (lower or upper, your choice)

        i =1;   //print out prime numbers btwn 0-1000
        int n=i;
        boolean isPrime=true;
        while(i < 1000){
            n=2;
            isPrime = true;
            while(n<i){
                if((i% n) == 0){
                    isPrime=false;
                }
                n++;
            }
            if(isPrime){
                System.out.println(""+i);
            }
            i++;
        }
        i = 0; //print out palindromes btwn 0-10,000
        while(i<=10000){
            String numberStr = Integer.toString(i);
            StringBuilder sb = new StringBuilder(numberStr);
            String reversedStr = sb.reverse().toString();
            if (numberStr.equals(reversedStr)){
                System.out.println(i);
            } 
            i++;
        }
        i = 1000; //Print out 1000 to -1000 by 50
        while(i > -1050 ){
            System.out.println(i);
            i-=50;
        }
        //print out the alphabet 
        char k = 'A';
        while (k <= 'Z'){
            System.out.println(k++);
        }
        
        ////////////////////////////////////////////////////        FOR LOOPS       ///////////////////////////////////////////////////
        /*
         * for(iterator varible; condition is true; iterate your iterator varible;){
         *      do this
         * }
         */
        for (int a = 9; a>=0; a--){
            System.out.print(a);
        }
        System.out.println();
        //print out 0-20 but odds
        for (int a=1; a<=20; a+=2){
            System.out.println(a);
        }
        System.out.println();
        
        for (int c=0; c<100; c++){
            for (int d=0; d<10; d++){
                System.out.print(c+""+d+" ");                
            }
            System.out.println();
        }
        
        

    }
}