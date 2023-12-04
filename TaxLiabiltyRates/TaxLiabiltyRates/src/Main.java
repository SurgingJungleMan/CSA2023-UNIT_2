import java.lang.Math;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    static double GI;
    static double AGI;

    static {
        System.out.println("Calculate your tax rate...");
    }


    public static double getRates(double GI){
        double taxLiab = 0;
        double taxRates = 0;

        if (GI < 11000){
            taxRates = 0.01;
        }
        else if (GI > 11000 && GI <= 50000){
            taxRates = 0.025;
        }
        else if (GI > 50000 && GI <= 150000){
            taxRates = 0.05;
        }
        else if (GI > 150000 && GI <= 300000){
            taxRates = 0.09;
        }
        else if (GI > 300000 && GI <= 450000){
            taxRates = 0.12;
        }
        else if (GI > 450000 && GI <= 694000){
            taxRates = 0.19;
        }else{
            taxRates = 0.31;
        }

        taxLiab = (GI * taxRates)/100;

        return taxLiab;
    }


    static void ask(){
        System.out.println("How much is your salary?");
        GI = sc.nextDouble() - 14850;

        if (GI <= 0){
            System.out.println("No tax.");
        }else{
            double taxLiability = getRates(GI);

            if (taxLiability < 12){
                System.out.println("Low tax liability + " + taxLiability);
            }else if(taxLiability > 12 && taxLiability <= 36){
                System.out.println("Medium tax liability " + taxLiability);
            }else if(taxLiability > 36){
                System.out.println("High tax liability + " + taxLiability);
            }
        }



    }

    public static void main(String[] args) {
        ask();
    }
}