import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println(numbers); // get teh reference in memory
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
        // Abstract classes: can't instantiate them

        NumberFormat crncy =  NumberFormat.getCurrencyInstance();
        String resultCurncy = crncy.format(123456.78901);
        System.out.println(resultCurncy);

        NumberFormat pcnt =  NumberFormat.getPercentInstance();
        String resultpcnt = pcnt.format(0.157);
        System.out.println(resultpcnt);

        // Reading Input:

        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        byte agee = scanner.nextByte() ;
        System.out.println("You are " + agee);


        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name? ");
        String name = scanner1.nextLine().trim();
        System.out.println("You are " + name);


        // Simplifying If Statements

        int income = 120_000;
        boolean elegible = (income > 100_000) ? true : false;
        System.out.println("Are you elegible? " + elegible);


        // Switch Statements

        String role = "admin";

        switch (role) {
            case "principal":
                System.out.println("You are a principal");
                break;
            case "admin":
                System.out.println("You are an admin");
                break;
            default:
                System.out.println("You are a guest");
        }

        /// *** FizzBuzz *** ///
        System.out.println("Input an integer: ");

        Scanner scanner3 = new Scanner(System.in);
        int newInput = scanner3.nextInt();

        if (newInput % 3 == 0) {
            if (newInput % 2 == 0) {
                System.out.println("The number is a multiple of 6");
            } else {
                System.out.println("The number is a multiple of 3");
            }
        } else if (newInput % 2 == 0) {
            System.out.println("The number is a multiple of 2");
        } else
            System.out.println("The number is NOT a multiple of 2 nor 3");


        // For loops

        for (int i = 1 ; i < 5 ; i++) {
            System.out.println("Number: " + i);
        }

        for (int i = 10 ; i < 5 ; i--) {
            System.out.println("Number reverse: " + i);
        }


        // While loops

        int num = 10;
        while (num > 1) {
            System.out.println("Number while: " + num);
            num--;
        }

        Scanner scanner34 = new Scanner(System.in);
        String newString = "";

        while (!newString.equals("quit")) {
            System.out.println("Enter new word (ref: quit) ");
            newString = scanner34.next().toLowerCase();
        }

        Scanner scanner4 = new Scanner(System.in);
        int newInput2 = 0;

        while (true) {
            System.out.println("Input new integer ");
            newInput2 = scanner4.nextInt();
            if(newInput2 > 10) {
                System.out.println("Integer must be higher than ten....");
                continue;
            }
            else
                break;

        }

        // For each: iterate through a collection

        String [] fruits = {"Grapes", "Watermelon", "Apple"};

        for(int i = 0 ; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for(int i = fruits.length  ; i >= 0; i--){
            System.out.println(fruits[i]);
        }

        for (String f: fruits) {
            System.out.println(f);
        }










        /// **** Mortgage Calculator **** /////

        final byte MONTHS = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualRate = 0;
        int totalYears = 0;

        Scanner scannerMC = new Scanner(System.in);

        while (true) {
            System.out.print("Enter principal amount (USD 1K : - 1MM): " );
            principal = scannerMC.nextInt();

            if(principal >= 1000 && principal <= 100_000_000)
                break;
        }


        while (true) {
            System.out.print("Enter annual interest rate: ");
            annualRate = scannerMC.nextFloat();

            if(annualRate >= 1 && annualRate <= 30) {
                break;
            } else {
                System.out.print("Enter a value between 1 and 30: ");
            }
        }

        // Calculate monthly rate

        float monthlyRate = annualRate / PERCENT / MONTHS ;



        while (true) {
            System.out.print("Number of years: ");
            totalYears = scannerMC.nextByte();

            if(totalYears >= 1 && totalYears <= 30) {
                break;
            } else {
                System.out.print("Enter a value between 1 and 30");
            }
        }


        int numberOfPayments = totalYears * MONTHS ;

        double mortgage = principal * (monthlyRate * Math.pow(1+monthlyRate,numberOfPayments))/ (Math.pow(1+monthlyRate,numberOfPayments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Your mortgage estimate is: " + mortgageFormatted);





































































    }
}