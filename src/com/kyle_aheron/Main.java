package com.kyle_aheron;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Welcome ot Kyle's know-all, do-all calculator.");
        System.out.println("Please enter the type of math you wish to do.");
        System.out.println("Enter help to receive a list of all of the programmed equations.");
        Scanner usrInput = new Scanner(System.in);
            String input = usrInput.next();
            if(input.equals("Quadratic Formula") || input.equals("QuadForm")){
                usrInput.close();
                System.out.println("You have chosen Quadratic Formula.");
                System.out.println("-This implies that you have a Quadratic Trinomial that falls under the following temple; ax + by + c = 0");
                System.out.println("--Please note that we will be working with the leading coefficients of the terms");

                Quadratic_Formula work = new Quadratic_Formula();
                Gather_Data firstTerm = new Gather_Data();
                Gather_Data secTerm = new Gather_Data();
                Gather_Data thirdTerm = new Gather_Data();

                int numAX;
                numAX = firstTerm.ax();
                int numBX;
                numBX =  secTerm.bx();
                int numC;
                numC = thirdTerm.c();
                
                System.out.println("Your answer is" + work.posQuadForm(numAX, numBX, numC) +"or" + work.negQuadForm(numAX, numBX, numC) +".");



            }



    }

}
