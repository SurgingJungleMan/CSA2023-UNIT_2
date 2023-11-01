import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);
    // function to calculate letter grade
    static String calculateLetter(double tG, double dG, double csaG, double cG){
        String myGrade = "F";

        // This calculation would return the total percentage grade...
        // ((90*0.4)+(90*0.4)+(90*0.1)+(90*0.1))/100
        double curGrade = ((tG*0.4)+(dG*0.4)+(csaG*0.1)+(cG*0.1));

        // Follows standard american calculations
        if (curGrade > 89){
            myGrade = "A";
        }else if (curGrade < 89 && curGrade >= 80){
            myGrade = "B";
        }else if (curGrade < 80 && curGrade >= 70){
            myGrade = "C";
        }else if (curGrade < 70 && curGrade >= 60){
            myGrade = "D";
        }

        return  myGrade;
    }


    // function to get grades from scanner
    // the reason it's static is that no object is created
    static String askGrades(){
        // all the questions we're going to ask
        double tG;
        double dG;
        double csaG;
        double clsG;

        System.out.println("Please state as a percentage");
        System.out.println("What are your tests grades?");
        tG = sc.nextDouble();

        System.out.println("What is your game design grade?");
        dG = sc.nextDouble();

        System.out.println("What is your csa assignment grade?");
        csaG = sc.nextDouble();

        System.out.println("What are your classwork/homework?");
        clsG = sc.nextDouble();

        return calculateLetter(tG, dG, csaG, clsG);
    }

    public static void main(String[] args) {
        System.out.println(askGrades());
    }
}