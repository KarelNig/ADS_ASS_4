package ASS_4_FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a factory (1 - Chair Factory, 2 - Table Factory):");
        int choice = scanner.nextInt();
        FurnitureFactory factory;

        if (choice == 1) {
            factory = new ChairFactory();
            System.out.println("You chose the Chair Factory.");
            System.out.println("Available types of chairs:");
            System.out.println("1. Regular chair");
            System.out.println("2. Chair with armrests");
            System.out.println("3. Chair with cushion");
            System.out.println("4. Bar stool");
            System.out.println("5. Office chair");
        } else if (choice == 2) {
            factory = new TableFactory();
            System.out.println("You chose the Table Factory.");
            System.out.println("Available types of tables:");
            System.out.println("1. Regular table");
            System.out.println("2. Table with drawers");
            System.out.println("3. Dining table");
            System.out.println("4. Computer table");
            System.out.println("5. Folding table");
        } else {
            System.out.println("Invalid factory choice.");
            return;
        }

        System.out.println("Which type of furniture would you like to see (enter a number)?");
        int furnitureType = scanner.nextInt();

        Furniture furniture = factory.createFurniture();

        System.out.println("You selected:");
        if (factory instanceof ChairFactory) {
            switch (furnitureType) {
                case 1:
                    System.out.println("Regular chair");
                    System.out.println("Monthly production: 1000 chairs");
                    break;
                case 2:
                    System.out.println("Chair with armrests");
                    System.out.println("Monthly production: 800 chairs");
                    break;
                case 3:
                    System.out.println("Chair with cushion");
                    System.out.println("Monthly production: 700 chairs");
                    break;
                case 4:
                    System.out.println("Bar stool");
                    System.out.println("Monthly production: 1200 stools");
                    break;
                case 5:
                    System.out.println("Office chair");
                    System.out.println("Monthly production: 1500 chairs");
                    break;
                default:
                    System.out.println("Invalid furniture type choice.");
                    return;
            }
        } else if (factory instanceof TableFactory) {
            switch (furnitureType) {
                case 1:
                    System.out.println("Regular table");
                    System.out.println("Monthly production: 900 tables");
                    break;
                case 2:
                    System.out.println("Table with drawers");
                    System.out.println("Monthly production: 600 tables");
                    break;
                case 3:
                    System.out.println("Dining table");
                    System.out.println("Monthly production: 800 tables");
                    break;
                case 4:
                    System.out.println("Computer table");
                    System.out.println("Monthly production: 700 tables");
                    break;
                case 5:
                    System.out.println("Folding table");
                    System.out.println("Monthly production: 1000 tables");
                    break;
                default:
                    System.out.println("Invalid furniture type choice.");
                    return;
            }
        }

        furniture.assemble();
    }
}
