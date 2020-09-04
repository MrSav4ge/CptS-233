import java.util.Scanner;

/*
Sean Skinner
CptS 233: MicroAssignment # 1
9/3/20
gitRepo url: https://github.com/MrSav4ge/CptS-233
*/

public class CarpetCalc {
    public static void main(String[]args) {
        int length;
        int width;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length of the room");
        length = in.nextInt();

        System.out.println("Please enter the width of the room");
        width = in.nextInt();

        RoomDimension room = new RoomDimension();
        room.setRoomLength(length);
        room.setRoomWidth(width);

        RoomCarpet room2 = new RoomCarpet();
        room2.setRoomDimension(room);

        System.out.println("Room dimensions");
        System.out.println("Length:" + length + " Width:" + width + " Area:" + width*length);

        System.out.println("Carpet cost: $" + room2.getCost());

        in.close();
    }
}