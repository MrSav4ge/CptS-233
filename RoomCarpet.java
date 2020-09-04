
public class RoomCarpet{
    private RoomDimension room;

    final int carpetCost = 8;
    public void setRoomDimension(RoomDimension room){
        this.room = room;
    }
    public int getCost(){
        return room.getArea() * carpetCost;
    }
}
