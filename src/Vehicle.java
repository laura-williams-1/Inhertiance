public class Vehicle {
    private int numOfDoors;
    private int numOfWheels;
    private double loadCapacity;
    private String model;

    public Vehicle(){
        this(4,4,1000,"Unknown");
    }
    public Vehicle(int numOfDoors, int numOfWheels, double loadCapacity, String model){
        this.numOfDoors = numOfDoors;
        this.numOfWheels = numOfWheels;
        this.loadCapacity = loadCapacity;
        this.model = model;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public void setNumOfDoor(int numOfDoors){
        this.numOfDoors = numOfDoors;
    }

}
