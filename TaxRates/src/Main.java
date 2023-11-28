// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;



public class Main {
    static {
        System.out.println("2023 TAX RATES.");
        System.out.println("THIS IS NOT FOR MARRIED COUPLES.");
    }

    static Scanner sc;
    static double calc(double income){
        double tax = 0;


        double rates = 0; // the percentage
        double amount = 0; // the set amount
        double prev = 0; // the maximum limit of the previous tax bracket


        if (income < 11000){
            prev = 0;
            rates = 0.1;
            amount = 0;
        }else if (income < 44725 && income > 11000){
            prev = 11000;
            rates = 0.12;
            amount = 1100;
        }else if (income < 95375 && income > 44725){
            prev = 44725;
            rates = 0.22;
            amount = 5147;
        }else if (income < 182100 && income > 95375){
            prev = 95375;
            rates = 0.24;
            amount = 16290;
        }else if (income < 231250 && income > 182100){
            prev = 182100;
            rates = 0.32;
            amount = 37104;
        }else if (income < 578900 && income > 231250){
            prev = 231250;
            rates = 0.35;
            amount = 52832;
        }else if (income > 578900){
            prev = 578900;
            rates = 0.37;
            amount = 174238;
        }

        tax = ((income-prev)*rates) + amount;

        return tax;
    }

    static void ask(){
        System.out.println("What is your income?");
        double income = sc.nextDouble();
        double tax = calc(income);

        if (tax <= 0){
            System.out.println("Error occured... retry...");
            ask();
        }else if (tax > 0){
            System.out.println("This is your tax : " + tax);
        }
    }



    public static void main(String[] args) {
        ask();
    }

    static{
        sc = new Scanner(System.in);
    }
}