package be.intecbrussel.whileloop;

import java.util.Scanner;

public class Assignment16_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter a number between 0 and 10");
            num = scanner.nextInt();
        } while(num<0 || num>10);

        System.out.println("You entered a valid number: " + num);

       /* while (true){
            System.out.println("Enter a number between 0 and 10");
            int num = scanner.nextInt();
            if(num>=0 && num <=10) break;

            System.out.println("You entered invalid number.");

        */
        }



    }
