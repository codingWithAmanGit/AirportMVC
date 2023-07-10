package AirportMVC;

public class controller {
    
    private preferencesModel pm;
    private reservationModel rm;
    private businessLogic bl;


    public controller(preferencesModel pm, reservationModel rm, businessLogic bl){
        this.pm =pm;
        this.rm =rm;
        this.bl = bl;
    }


    public void manageController(){
        
        bl.printTicket(pm, rm);
    }

}
