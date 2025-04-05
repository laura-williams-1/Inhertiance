public class Vehicle {
    private int numOfDoor;
    private int numOfWheels;
    private double loadCapacity;
    private String model;

    public Vehicle(){
        this(4,4,1000,"Unknown");
    }
    public Vehicle(int numOfDoor, int numOfWheels, double loadCapacity, String model){
        this.numOfDoor = numOfDoor;
        this.numOfWheels = numOfWheels;
        this.loadCapacity = loadCapacity;
        this.model = model;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

}
