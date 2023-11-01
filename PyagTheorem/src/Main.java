import java.util.Objects; // suggested by intellj
import java.util.Scanner;
import java.lang.Math;


public class Main {
    static Scanner sc = new Scanner(System.in);


    static String format2f(double number){
        number = Math.round(number * 100.0) / 100.0;

        // format
        // https://stackoverflow.com/questions/433958/java-decimal-formatting-using-string-format
        return String.format("%.2f", number);
    }
    // gets the hypo's side length
    static void missingHypo(){
        System.out.println("What is the length of the opposite side?");
        double opp = sc.nextDouble();

        System.out.println("What is the length of the adjacent side?");
        double adj = sc.nextDouble();

        double hypo = Math.sqrt(Math.pow(opp, 2) + Math.pow(adj, 2));
        String updated = format2f(hypo);

        System.out.println("This is your missing side : " + updated);
        ask();
    }
    // This gets the other missing side that isn't the hypo
    static void missingSecond(){
        System.out.println("What is the length of the hypotenuse?");
        double hypo = sc.nextDouble();

        System.out.println("What is the length of the avaible side?");
        double adj = sc.nextDouble();

        if (hypo < adj){
            System.out.println("Hypotenuse cannot be longer then the adjacent side.");
            missingSecond();
            return;
        }

        double bottom = Math.sqrt(Math.pow(hypo, 2) - Math.pow(adj, 2));
        String updated = format2f(bottom);

        System.out.println("This is your missing side : " + updated);
        ask();
    }


    static void ask(){
        System.out.println("What side are your missing? [A]=Other [B]=Hypo");
        String choice = sc.nextLine();

        if (Objects.equals(choice, "A") || Objects.equals(choice, "a"){
            missingSecond();
        }else if (Objects.equals(choice, "C") || Objects.equals(choice, "c")){
            missingHypo();
        }else{
            System.out.println("Error! Input not registered. Ignore if nothing breaks lol.");
            ask();
        }

    }


    public static void main(String[] args) {
        ask();
    }
}
