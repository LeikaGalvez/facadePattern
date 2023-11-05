package facadePattern;
import java.util.*;

public class HotelApp {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the plate number of your car: ");
        String plateNumber = scan.nextLine();
        System.out.print("Enter your room number: ");
        int roomNumber = scan.nextInt();
        System.out.print("Enter the number of carts you wish to have: ");
        int numberOfCarts = scan.nextInt();
        System.out.print("\n 1.) Valet Parking \n 2.) House Keeping \n 3.) Get luggage carts\nWhich service do you wish to use?\nEnter choice: ");
        int choice = scan.nextInt();
        System.out.println();

        Valet valet = new Valet(plateNumber);
        HotelService houseKeep = new HouseKeeping(roomNumber);
        HotelService cart = new Cart(numberOfCarts);
        FrontDesk frontDesk;

        if (choice == 1) {
            frontDesk = new FrontDesk(valet);
            frontDesk.service();
        } else if (choice == 2){
            frontDesk = new FrontDesk(houseKeep);
            frontDesk.service();
        } else if (choice == 3){
            frontDesk = new FrontDesk(cart);
            frontDesk.service();
        } else {
            System.out.println("Please choose a valid service option.\n");
        }

    }
}
