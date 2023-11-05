package facadePattern;

public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    @Override
    public void service() {
        System.out.println(cleanRoom(roomNumber));
    }

    public String cleanRoom(int roomNumber){
        return "Requesting housekeeping for room number " + roomNumber + ".";
    }
}
