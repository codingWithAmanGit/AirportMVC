package AirportMVC;

public class businessLogic {
    
    private controller c;

    public businessLogic(){
        this.c = c;
    }


    public void printTicket(preferencesModel pm2, reservationModel rm2){

        //if any issue with the the ticket, return to travel agency.
        if(rm2.getReservationNum() > 100){
            System.out.println("There is issue with the reservation. Kindly call 1800 0011");
        }else{
            //if there is no baggage to carry.
            if(pm2.getBagWT() == 0){
                pm2.getName();
                System.out.println("There is nothing to carry in the flight.");
            }else{
                //if there is baggage to carry.
                pm2.getName();
                pm2.getBagWT();
            }
        }
    }
}
