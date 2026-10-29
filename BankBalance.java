
package com.mycompany.bankbalance;

import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {
        int option;
        int pin;
        int num;
        double withdrawalBalance;
         double AvailBal = 10000;
        double enteredDeposit;
        int attempt = 0;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("<.........welcome to MUILA ATM.......>");
        System.out.println("...please choose your service type below...");
        
        System.out.println("press 1 for card");
        System.out.println("press 2 for cardless");
        System.out.println("press 3 for deposit money");
        option = input.nextInt();
        
        
        
         if(option == 3){
             System.out.println("please note deposit start from R50");
            System.out.println("how much do you want to deposit");
             enteredDeposit = input.nextDouble();
             
             if(enteredDeposit >= 50){
                 System.out.println("deposit approved....you succesful deposited R " + enteredDeposit);
                  AvailBal = AvailBal + enteredDeposit;
                  System.out.println("your available balance is R: " + AvailBal);
             }else{
                 System.out.println("deposit unsuccesful you entered lower amount R" + enteredDeposit);
             }
         
         
        
              if(option == 1){
            while(attempt <3){
                
            
          System.out.println("enter your pin");
        pin = input.nextInt();
        if(pin == 20100){
            
            System.out.println("pin okay.....welcome access succesful");
              break;
        }else{
            System.out.println("access denied...wrong pin ");
            attempt++;
        }
            }
                     }
        else if(option == 2){
        System.out.println("enter your money number:");
        num = input.nextInt();
        if(num == 3334444){
            System.out.println("correct money pin entered....access accepted");
        }else{
            System.out.println("wrong money entered number access denied");
        } 
             
        }
    }
           
        
        
        if(option == 1){
            System.out.println("press 1 to view your availble balance ");
            System.out.println("press 2 to withdraw your money");
            option = input.nextInt();
             System.out.println("enter your pin");
        pin = input.nextInt();
        if(pin == 20100){
            System.out.println("pin okay....welcome access accepted");
        }else{
            System.out.println("access denied....wrong pin");
        }
            
            
            
          if(option == 1){
                System.out.println("your availble balance is R: " + AvailBal);
            }else if(option == 2){
            if(option == 1){
    System.out.println("press 1 to view your available balance");
    System.out.println("press 2 to withdraw your money");
    option = input.nextInt();

    System.out.println("enter your pin");
    pin = input.nextInt();

    if(pin == 20100){
        System.out.println("pin okay....welcome access accepted");

       

        }else if(option == 2){
            System.out.println("please enter your withdrawal balance");
            withdrawalBalance = input.nextDouble();

            if(withdrawalBalance > 0 && withdrawalBalance <= AvailBal){
                System.out.println("withdrawal approved, R " + withdrawalBalance);
                AvailBal = AvailBal - withdrawalBalance;
                System.out.println("your remaining balance is R: " + AvailBal);

            }else{
                System.out.println("access denied: invalid amount or insufficient balance");
            }

        }else{
            System.out.println("invalid option selected");
        }

    }else{
        System.out.println("access denied....wrong pin");
    }

         }
        }
        
        
        
    }
}
