import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void convertC(){
        System.out.println("What is your temperature in fahrenheit?");
        double fahren = sc.nextDouble();


        // calculate celsius
        double celsius = ((fahren-32)*5)/9;
        // round to second decimal
        // https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
        celsius = Math.round(celsius * 100.0) / 100.0;

        // format and print
        //https://stackoverflow.com/questions/433958/java-decimal-formatting-using-string-format
        String custom = String.format("%.2f", celsius);
        System.out.println("This is your temperature in °C " + custom);
        choose();
    }
    static void convertF(){
        System.out.println("What is your temperature in celsius?");
        double celsius = sc.nextDouble();

        // calculate fahrenheit
        double fahren = (celsius * 1.8) + 32;
        // round
        fahren = Math.round(fahren * 100.0) / 100.0;

        // format
        // https://stackoverflow.com/questions/433958/java-decimal-formatting-using-string-format
        String custom = String.format("%.2f", fahren);
        System.out.println("This is your temperature in °F " + custom);
        choose();
    }

    static void choose(){
        System.out.println("Would you like to convert to Celsius[1] or Fahrenheit[2]?");
        int choice = sc.nextInt();

        if (choice == 1){
            convertC();
        }else if (choice == 2){
            convertF();
        }else{
            System.out.println("Error!");
            choose();
        }
    }

    public static void main(String[] args) {
        choose();
    }
}