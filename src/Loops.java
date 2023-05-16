public class Loops {
    public static void main(String[] args) {
        // There are 3 types of Loops.
        // 1. While Loop
            // Initilazation
            int i = 0;
            // Condition
            while (i < 10){
                System.out.println(i);
                // Incrementaion
                i++;
            }

         // 2. For Loop
            for(int j = 10; j > 0 ; j--){
                System.out.println(j);
            }

         // 3. Do While
            int k = 0;
            do{
                System.out.println("K runs");
                k++;
            }while (k < 0);

        System.out.println(234%10);
        System.out.println(234/10);

        for(int r = 0; r < 10; r++){
            for (int c = 0; c <= r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

/*

*
* *
* * *
* * * *

1. Find if a number is palindrome - 121 -> 121 | 123 !-> 321
* */
