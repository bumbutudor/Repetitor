package ui;

import java.util.Scanner;

public class MainMenu {

    public void displayOptions() {
        System.out.println("===== Meniu Repetitor =====");
        System.out.println("1. Generează o problemă de matematică ");
        System.out.println("2. Rezolvă o problemă de matematică");
        System.out.println("3. Vezi istoricul problemelor");
        System.out.println("4. Ieșire");
        System.out.println("================================");
        System.out.print("Alege o opțiune: ");
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void navigate() {
        displayOptions();
        int choice = getUserInput();

        switch (choice) {
            case 1:
                // Logic to generate a new math problem
                break;
            case 2:
                // Logic to solve an existing problem
                break;
            case 3:
                // Logic to view problem history
                break;
            case 4:
                System.out.println("Ieșire...");
                System.exit(0);
                break;
            default:
                System.out.println("Alegere invalidă. Te rog să selectezi o opțiune validă.");
                navigate(); // Recursively call the function for a new choice
                break;
        }
    }
}
