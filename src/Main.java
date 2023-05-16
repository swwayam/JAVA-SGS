import java.util.Scanner;

// Filename should be same as the class name
class Main {
    // there should be a main method present as java starts it's execution from this
    // method itself.
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text for int");
        // To take input of int datatype
        int num1 = sc.nextInt();
        System.out.println(num1);
        // To take input of double datatype
        System.out.println("Enter a text for num2");
        double num2 = sc.nextDouble(); // same goes for float , short , byte
        System.out.println(num2);
        // To take input of string datatype
        System.out.println("Enter a text for name");
        String name = sc.nextLine(); // next line will take the whole line
        System.out.println(name);
        // sc.next()
        System.out.println("Enter a text for name1");
        String name1 = sc.next(); // Takes the first word
        System.out.println(name1);
    }

}