package Main;

import java.util.Scanner;
import banking.bankApp;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int tries = 0;
        
        switch(choice){
            case 1:
                
                while(tries < 3){
                    
                bankApp bc = new bankApp();
                
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.Verify(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        break;
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                        System.out.println("Try Again!");
                        tries ++;
                    }
                    
                    if(tries == 3){
                    System.out.println("Attempts Exceeded; System Closing: ");
                    }
                }
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
        
            
    }
    
}