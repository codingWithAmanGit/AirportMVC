package AirportMVC;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        preferencesModel prefM = new preferencesModel("Aman", 10);
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Name of the passenger:");
        // String name = scn.nextLine();
        // System.out.println("Reservation Number");
        reservationModel reserM = new reservationModel(50);

        businessLogic bl = new businessLogic();

        controller c = new controller(prefM, reserM, bl);

        

        ticketView ticV = new ticketView();
        ticV.viewTicket();
    }
}
