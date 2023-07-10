package AirportMVC;

public class preferencesModel {
    
    private String Name;
    private int bagWT;


    public preferencesModel(String name, int bagWT) {
        Name = name;
        this.bagWT = bagWT;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public int getBagWT() {
        return bagWT;
    }


    public void setBagWT(int bagWT) {
        this.bagWT = bagWT;
    }   
    
}
