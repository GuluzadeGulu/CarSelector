import java.util.Scanner;

public class CarSelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] carBrands = {"VOLVO", "MERCEDES", "BMW", "LADA", "TOYOTA"};

        while (true) {
            System.out.println("Enter \"e\" to exit. ");
            for (int i = 0; i < carBrands.length; i++) {
                System.out.println(i + " - " + carBrands[i]);
            }
            System.out.print("\nEnter index of value (number must be between 0 and " + (carBrands.length - 1) + "): ");
            String inputScanner = scan.nextLine().toLowerCase();

            try {
                if (inputScanner.isEmpty()) {
                    System.out.println("You entered nothing.");
                } else if (inputScanner.equals("e")) {
                    System.out.println("Program closed");
                    break;
                } else {
                    int selectedIndex = Integer.parseInt(inputScanner);

                    if (selectedIndex < 0 || selectedIndex >= carBrands.length) {
                        System.out.println("Invalid index. Please enter a number between 0 and " + (carBrands.length - 1) + ".");
                    } else {
                        System.out.println("You chose: " + carBrands[selectedIndex] + ". Good choice!");
                        break;
                    }
                }
            } catch(NumberFormatException e){
                System.out.println("Error: You must enter a whole number (integer).");
            }
        }

        scan.close();
    }
}