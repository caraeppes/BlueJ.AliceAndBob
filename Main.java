/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){

       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter your name:");
       
       String name = in.nextLine();
       
       if (name.equals("Bob")){
           System.out.println("Hello Bob!");
        }
        
       else if (name.equals("Alice")){
            System.out.println("Yoooo Alice!");
        }
        
        else {
            System.out.println("Byeeeee.");
        }
    }  
   }

