
import java.util.Scanner;

public class main {

    public static void main (String[] args){

        automobile automobile = new automobile();
        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.println("\nSelect Below option:");
            System.out.println("Enter 1 for Add Vehicle");
            System.out.println("Enter 2 for Update Vehicle");
            System.out.println("Enter 3 for Remove Vehicle");
            System.out.println("Enter 4 for Display Vehicles");
            System.out.println("Enter 5 for Exit");
            System.out.print("Chose option: ");
            int option = userInput.nextInt();
            userInput.nextLine();
            if (option == 1) {
                System.out.println("\nEnter Vehicle Information to Add:");
                System.out.print("Enter Maker: ");
                String maker = userInput.nextLine();
                System.out.print("Enter Model: ");
                String model = userInput.nextLine();
                System.out.print("Enter Color: ");
                String color = userInput.nextLine();
                System.out.print("Enter Manufacturing Year: ");
                int year = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileage = userInput.nextInt();
                userInput.nextLine();
                automobile vehicle = new automobile(maker, model, color, year, mileage);
                automobile.addVehicle(vehicle);
            } else if (option == 2) {
                System.out.println("\nEnter Old Vehicle Information to Update:");
                System.out.print("Enter Maker: ");
                String makerOld = userInput.nextLine();
                System.out.print("Enter Model: ");
                String modelOld = userInput.nextLine();
                System.out.print("Enter Color: ");
                String colorOld = userInput.nextLine();
                System.out.print("Enter Manufacturing Year: ");
                int yearOld = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileageOld = userInput.nextInt();
                userInput.nextLine();
                System.out.println("\nEnter New Vehicle Information to Update:");
                System.out.print("Enter Maker: ");
                String makerNew = userInput.nextLine();
                System.out.print("Enter Model: ");
                String modelNew = userInput.nextLine();
                System.out.print("Enter Color: ");
                String colorNew = userInput.nextLine();
                System.out.print("Enter Manufacturing Year: ");
                int yearNew = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileageNew = userInput.nextInt();
                userInput.nextLine();
                automobile.updateVehicle(makerOld, modelOld, colorOld, yearOld, mileageOld,
                        makerNew, modelNew, colorNew, yearNew, mileageNew);
            } else if (option == 3) {
                System.out.println("\nEnter Vehicle Information to Remove:");
                System.out.print("Enter Maker: ");
                String maker = userInput.nextLine();
                System.out.print("Enter Model: ");
                String model = userInput.nextLine();
                System.out.print("Enter Color: ");
                String color = userInput.nextLine();
                System.out.print("Enter Manufacturing Year: ");
                int year = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileage = userInput.nextInt();
                userInput.nextLine();
                automobile.removeVehicle(maker, model, color, year, mileage);
            } else if (option == 4) {
                automobile.Display();
            } else {
                System.out.println("Exit!");
                break;
            }
        }
        userInput.close();
    }




    }

