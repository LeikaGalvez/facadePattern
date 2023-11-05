package facadePattern;

public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void service() {
        System.out.println(pickUpVehicle(plateNumber));
    }

    public String pickUpVehicle(String plateNumber){
        return "On the way to pick up vehicle with the plate number: " + plateNumber;
    }
}
