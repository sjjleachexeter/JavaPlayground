import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class classes {
    public static void main(String ags[]) 
    throws IOException {
        //creating an instance of Random
        Random r = new Random();
        //getting inpu
        Scanner number = new Scanner(System.in);
        //formula for range is (max - min + 1) + min
        int random = r.nextInt(10 - 2) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 10, have a guess.");

        int yourNumber = number.nextLine();
        if (yourNumber<1 || yourNumber > 10) {
            System.out.println("your number is not in the required range.");
        }
        //So I think what we're going to do here is try to take some strings as arguments and check wether they match a guess
    }
}