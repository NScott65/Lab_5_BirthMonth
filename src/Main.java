import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        int mNum = 0;

        System.out.print("Enter a number (1-12) that connnects to your birth month: ");
        if(scan.hasNextInt()){
            mNum = scan.nextInt();
        }else if(mNum >= 13){
            System.out.print("Your input was invalid.");
            System.exit(0);
        }
        if(mNum == 1){
            System.out.print("You were born in January.");
            System.exit(0);
        }else if(mNum == 2) {
            System.out.print("You were born in Feburary.");
            System.exit(0);
        }else if(mNum == 3) {
            System.out.print("You were born in March.");
            System.exit(0);
        }else if(mNum == 4) {
            System.out.print("You were born in April.");
            System.exit(0);
        }else if(mNum == 5) {
            System.out.print("You were born in May.");
            System.exit(0);
        }else if(mNum == 6) {
            System.out.print("You were born in June.");
            System.exit(0);
        }else if(mNum == 7) {
            System.out.print("You were born in July.");
            System.exit(0);
        }else if(mNum == 8) {
            System.out.print("You were born in August.");
            System.exit(0);
        }else if(mNum == 9) {
            System.out.print("You were born in September.");
            System.exit(0);
        }else if(mNum == 10) {
            System.out.print("You were born in October.");
            System.exit(0);
        }else if(mNum == 11) {
            System.out.print("You were born in November.");
            System.exit(0);
        }else if(mNum == 12) {
            System.out.print("You were born in December.");
            System.exit(0);
        }
    }
}