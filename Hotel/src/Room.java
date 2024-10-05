public class Room {
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true; // по подразбиране стаята е свободна
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void book() {
        this.isAvailable = false;
    }

    public void freeRoom() {
        this.isAvailable = true;
    }
}