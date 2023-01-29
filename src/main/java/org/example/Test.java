package org.example;
import java.util.*;

public class Test {
    public static void main(String[] arg) throws Exception
        {
            String s = "gfg geeks!";
            Scanner scanner = new Scanner(s);
            System.out.println("" + scanner.nextLine());
            // check if there is an IO exception
            System.out.println("" + scanner.ioException());
            // close the scanner
            scanner.close();
        }
}
