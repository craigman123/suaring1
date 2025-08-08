
package ACtivities;

import java.util.Scanner;

public class act1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int by;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your birth year: ");
        by = sc.nextInt();
        
        System.out.println("Hello "+name+" youre birth year is "+(2025-by));
    }
    
}