public class Truck extends Vehicle {
   private boolean trailerAttached;

    @Override
    public void start() {
       System.out.println("Truck has started");
    }

    public boolean isTrailerAttached(){
        return this.trailerAttached;
    }
    public void setTrailerAttached(boolean isAttached){
        this.trailerAttached = isAttached;
    }
}
