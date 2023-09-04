import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    // The main method in your program should always be static
    // void: No value will be returned
    public static void main(String[] args) {
        // f = short for field // print string class
        System.out.println("Hello and welcome!");

        // Compilation: Java uses the java compiles to compile the code to byte code
        //              ckeck out folder has the bytecode file. It's platform independent.
        //              It runs in any system with a JRE. The JRE has a JVM.
        //              cd into scr and type javac Main.java

        // Execution: The JVM takes the bytecode and translates it into the native
        //            code of the underlining OS
        //            Invoke JVM: cd into src and type java Main

        // Variables:
        // Store data temporarily in memory
        // Types:
        // ** Primitive: Store simple values
        //  - Numbers: byte / short / int/ long(L) / float(F) / double
        //  - Letters: char
        //  - Boolean : boolean
        // You don't need to allocate memory

        byte age = 30;
        long viewsCount = 3_000_000_000L;
        float price = 10.99F;

        // ** Reference: Store complex objects. Data objects, mail messages
        // You NEED to allocate memory
        byte ages = 30;

        Date now = new Date(); // Object: Instance of the Date class
        System.out.println(now.getTime()) ; // Objects have methods or members
        System.out.println(now);

        // Memory management

        byte x = 1 ;
        byte y = 1 ;

        // These are in different memory allocations
        y = 2 ;
        System.out.println(y); // x is not affected

        // Reference types: the variable stores the reference
        // to an object in the memory, not the actual object
        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 2; // Change the object in memory
        // Point1 and point 2 reference the same object
        System.out.println(point2);


        // Strings:
        // they are a reference type in Java.
        // String message = new String('Hello world')
        // Since strings are frequently used, there is a shortcut in Java
        // strings are immutable. The repalce/lowerCase/toUpperCase method creates a new instance

        String message = "Hello world" + "!!" ;
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.endsWith("?"));
        // Check new object
        System.out.println(message.replace("!", "**"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());


        // Escape sequences
        // Characters to be aware of: "" , \ ,

        String newMessage = "Hello \"Maby\" " ;
        System.out.println(newMessage);

        String path = "c:\\Windows\\" ;
        System.out.println(path);

        String path1 = "c:\nWindows\n" ; // new line
        System.out.println(path1);


        // Arrays:
        // reference type
        // They have a fixed length. You have to specify it.

        int [] numbers = new int[5] ;
        numbers[1] = 1;
        numbers[2] = 4;
        numbers[3] = 6;
        System.out.println(numbers); // get teh reference in momory
        System.out.println(Arrays.toString(numbers));  // string representation


        int [] numbersBis = {1,2,3,4,5,6,7,8,9};
        System.out.println(numbersBis.length);
        Arrays.sort(numbersBis);
        System.out.println(Arrays.toString(numbersBis));


        // Multi-Dimensional Arrays
        int[][] arrayNumbers = new int[2][3];
        arrayNumbers[0][1] = 2;
        System.out.println(Arrays.deepToString(arrayNumbers));

        int[][] arrayNumbers2 = {{0,1,3},{4,6,8}};
        arrayNumbers[0][1] = 2;
        System.out.println(Arrays.deepToString(arrayNumbers2));


        // Constants

        final float PI = 3.14F;
        // PI = 1;


        // Arithmetic Expressions

         // int result = 10/3 ; // this will print an error
        double result = (double) 10 / (double) 3 ;// This is called casting
        System.out.println(result);

        // Check this difference !!!
        int xbis = 1 ;
        int ybis = xbis++;
        System.out.println(xbis);
        System.out.println(ybis);

        int xx = 1 ;
        int yy = ++xx;
        System.out.println(xx);
        System.out.println(yy);

        // Implicit casting
        // byte >> short >> int >> long >> float >> double
        short xxx = 1 ;
        double yyy = xxx + 1.1;
        System.out.println(xxx);
        System.out.println(yyy);

        // Explicit casting
        // byte >> short >> int >> long >> float >> double
        double m = 1.8;
        int n = (int) m + 5;
        System.out.println(m);
        System.out.println(n);

        String mm = "1.8";
        double nn =  Double.parseDouble(mm)  + 5;
        System.out.println(mm);
        System.out.println(nn);

        // The Math Class

        // Reading an input
        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = Math.max(1,2);
        System.out.println(result3);

        double random1 = Math.random() *100 ;
        System.out.println(random1);

        double randomDouble = Math.round(Math.random() *100);
        System.out.println(randomDouble);

        int randomInt = (int) Math.round(Math.random() *100);
        System.out.println(randomInt);

        // Formatting Numbers



















































    }
}