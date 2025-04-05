public class Animal {
    private String type;
    private String size;
    private double weight;


    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
@Override
    public String toString(){
        return "Animal {" +
                "Type: " + type + '\'' +
                ", Size= " + size +'\''+
                " Weight= " + weight + '\'' +
                '}';
    }
    public  void move(String speed){
        System.out.println(type + " moves "+ speed);
    }
    public void makesNoise(){

    }
}