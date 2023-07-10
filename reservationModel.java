package AirportMVC;

public class reservationModel {
    
    private int reservationNum;

    public reservationModel(int reservationNum) {
        this.reservationNum = reservationNum;
    }

    public int getReservationNum() {
        return reservationNum;
    }

    public void setReservationNum(int reservationNum) {
        this.reservationNum = reservationNum;
    }
}
