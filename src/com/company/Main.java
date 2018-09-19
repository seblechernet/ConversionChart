package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number =  (int) (Math.random()*10);
        System.out.println(number);
        int i=0;
        while(i<=10){

            System.out.println("Enter your guess: ");
            Scanner scanner=new Scanner(System.in);

            int x=scanner.nextInt();

            if(x==number){
                System.out.println("your guess is: " + x);
                System.out.println("That is right! you are a good guesser");
                break;

             }

             else
                System.out.println("This is incorrect! Guess agian");
                i++;
             }


//        for (int inch = 1; inch <= 15; inch++) {
//            double mil = (inch * 25.4);
//            System.out.println(inch + " inches = " + mil + " millimeters ");
//
//        }
//
//        System.out.println("------------------");
//
//        int inch=1;
//        while (inch <= 15) {
//            double mil = (inch * 25.4);
//            System.out.println(inch + " inches = " + mil + " millimeters ");
//            inch++;
//        }
//        System.out.println("-------------------");
//
//        inch=1;
//        do {
//
//            double mil = (inch * 25.4);
//            System.out.println(inch + " inches = " + mil + " millimeters ");
//            inch++;
//        } while (inch <= 15);
//

//       for (int x=0;x<=100;x+=2){
//           System.out.println(x);
//       }
//       for(int x=0;x<=100;x+=5){
//           System.out.println(x);
//       }

    }
}
