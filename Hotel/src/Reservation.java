public class Reservation {
    private Customer customer;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(Customer customer, Room room, String checkInDate, String checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room.book(); // Стаята се запазва
    }

    public void cancelReservation() {
        this.room.freeRoom();
    }
}
