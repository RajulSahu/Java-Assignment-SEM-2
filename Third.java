package com.rajul;


class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean ACMachine;
    Room(){
        this.roomNo = 0;
        this.roomType = "";
        this.roomArea = 0.0;
        this.ACMachine = false;
    }
    void setData(int rn, String rt, double ra, boolean ac){
        this.roomNo = rn;
        this.roomType = rt;
        this.roomArea = ra;
        this.ACMachine = ac;
    }
    void displayData(){
        System.out.println("Room Type: " + this.roomType);
        System.out.println("Room Area: " + this.roomArea);
        System.out.println("Room Number: " + this.roomNo);
        System.out.println("AC Machine: " + this.ACMachine);
    }
}
class Third {
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(201, "Single", 400.0, true);
        room.displayData();
    }
}
