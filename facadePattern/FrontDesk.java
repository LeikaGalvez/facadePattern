package facadePattern;

public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public void service(){
     hotelService.service();
    }
}
