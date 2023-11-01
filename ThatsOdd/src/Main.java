import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    // function to check if it's odd
    // personally I like to ask for the inputs inside the function because
    // it's just more clean
    static void checkOdd(){
        System.out.println("What is your number that you'd like to check if its odd?");
        int myNumb = sc.nextInt();

        // intellij suggest me to do this
        boolean isOdd = myNumb % 2 == 1;
        // honestly not having to use if statements is nice but here is my if statements
        /*

        if(myNumb % 2 == 1){
           isOdd = true;
        }

         */

        System.out.println("This is if it's odd : " + isOdd);
        ask();
    }


    static void checkMulti(){
        System.out.println("What is the base number?");
        int divis = sc.nextInt();

        System.out.println("What is your potential multiple??");
        int divid = sc.nextInt();

        int modu = divid % divis;
        // intellij taught me this!!!
        boolean isMulti = modu == 0;

        // honestly not having to use if statements is nice but here is my if statements
        /*
        if(modu == 0){
           isMulti = true;
        }
         */


        System.out.println("Is your potential a multiple : " + isMulti);
    }


    static void ask(){
        System.out.println("Would you like to check odd [1] or check if the first number " +
                "is a multiple of the second [2].");
        int myInput = sc.nextInt();

        if (myInput == 1){
            checkOdd();
        }else if (myInput == 2){
            checkMulti();
        }else{
            System.out.println("Input not detected error.");
            ask();
        }
    }

    public static void main(String[] args) {
        ask();
    }
}