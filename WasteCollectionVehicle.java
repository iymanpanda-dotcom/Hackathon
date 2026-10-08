import java.util.Scanner;

public class WasteCollectionVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber;
        double wasteCollected;
        int collectionPoints;
        char vehicleStatus;

        System.out.print("Enter vehicle number: ");
        vehicleNumber = sc.nextInt();

        System.out.print("Enter waste collected in kg: ");
        wasteCollected = sc.nextDouble();

        System.out.print("Enter number of collection points: ");
        collectionPoints = sc.nextInt();

        System.out.print("Enter vehicle status: ");
        vehicleStatus = sc.next().charAt(0);

        System.out.println("\nVehicle Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        sc.close();
    }
}