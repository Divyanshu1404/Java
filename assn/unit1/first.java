package unit1;

public class first{
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;

    
    void setData(int rno, String type, double area, boolean ac) {
        roomNo = rno;
        roomType = type;
        roomArea = area;
        acMachine = ac;
    }

    
    void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq.ft");
        System.out.println("AC Machine Available: " + (acMachine ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        first room1 = new first();
        room1.setData(101, "Deluxe", 250.5, true);
        room1.displayData();
    }
}