package Lab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        System.out.println("Choose the lab:");
        Scanner scanner = new Scanner(System.in);
        int Lab = scanner.nextInt();
        switch (Lab) {
            case 1:
                Lab_1 Lab_1 = new Lab_1();
                mainMenu();
            case 2:
                Lab_2 Lab_2 = new Lab_2();
                mainMenu();
            case 3:
                //Lab_3 lab_3 = new Lab_3();
                mainMenu();
            case 4:
                //Lab_4 lab_4 = new Lab_4();
                mainMenu();
            case 5:
                //Lab_5 lab_5 = new Lab_5();
                mainMenu();
            case 6:
                //Lab_6 lab_6 = new Lab_6();
                mainMenu();
            case 7:
                //Lab_7 lab_7 = new Lab_7();
                mainMenu();
            case 8:
                //Lab_8 lab_8 = new Lab_8();
                mainMenu();
            case 9:
                //Lab_9 lab_9 = new Lab_9();
                mainMenu();
            case 10:
                //Lab_10 lab_10 = new Lab_10();
                mainMenu();
        }
    }
}