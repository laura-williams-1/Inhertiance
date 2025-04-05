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

    //setters

    /**
     *
     * @param numOfDoors, @param numOfDoors the number of doors for this vehicle
     */
    public void setNumOfDoor(int numOfDoors){
        this.numOfDoors = numOfDoors;
    }

    /**
     *
     * @param numOfWheels the num of wheels in a vehicle
     */
    public void setNumOfWheels(int numOfWheels){
        this.numOfWheels = numOfWheels;
    }

    /**
     *
     * @param loadCapacity max load capacity for a car
     */
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    /**
     *
     * @param model the name of the model of the vehicle
     */
    public void setModel(String model){
        this.model = model;
    }

}
