public class RoomDimension{
private int roomlength = 0;
private int roomwidth = 0;

public void setRoomLength(int roomlength){
    this.roomlength = roomlength;
}

public void setRoomWidth(int roomwidth){
    this.roomwidth = roomwidth;
}

public int getArea(){
    return roomwidth*roomlength;
}

}