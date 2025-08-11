package Main;

import java.util.Scanner;
import banking.bankApp;

public class Main {
    
    private static int add = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response;
        bankApp bapp[] = new bankApp[99];
        bapp[add] = new bankApp();
    do{ 
    
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    int accn, pin;
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.print("Enter Action: ");
                    int action = sc.nextInt();
                        
                        switch(action){
                            
                            case 1:
                                bapp[add] = new bankApp();
                                System.out.print("Enter Account No.: ");
                                bapp[add].setAccNo(sc.nextInt());
                                System.out.print("Enter Pin No.: ");
                                bapp[add].setPin(sc.nextInt());
                                System.out.println("Registered Account No: " + bapp[add].getAccNo());
                                add++;
                                break;
                                
                            case 2:
                                
                                int attempts = 3;
                                boolean loggedIn = false;

                                while (attempts > 0 && !loggedIn) {
                                    System.out.print("Enter Account No.: ");
                                    accn = sc.nextInt();
                                    System.out.print("Enter Pin No.: ");
                                    pin = sc.nextInt();

                                    // Check against all registered accounts
                                    for (int i = 0; i < add; i++) {
                                        if (bapp[i].verifyAccount(accn, pin)) {
                                            System.out.println("LOGIN SUCCESS!");
                                            loggedIn = true;
                                            break;
                                        }
                                    }

                                    if (!loggedIn) {
                                        attempts--;
                                        System.out.println("Invalid account. Attempts Left: " + attempts);
                                    }
                                }

                                if (!loggedIn) {
                                    System.out.println("MAX ATTEMPT LIMIT REACHED!");
                                    System.exit(0);
                                }
                                break;
                            case 3:
                                //EXIT
                                break;
                            default:
                                System.out.println("INVALID ACTION");
                        
                        }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("INVALID ACTION!");
            
            }
        System.out.println("Continue? (1/0): ");
        response = sc.nextInt();
    }while(response == 1);
    
    }
    
}