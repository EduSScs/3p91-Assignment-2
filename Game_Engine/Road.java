package Game_Engine;

public class Road {

    public int  capacity;
    public int length;
    private int carsOnStreet;

    public Intersection from; // origin of road
    public Intersection to; // Destination of road
    // using these two allow us to create roads of n width between any two cords as well as a-symmetrical roads
    // Network class should be able to create a road between specific intersections.

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    public void addCar() {
        carsOnStreet++;
    }
    public void removeCar() {
        carsOnStreet--;
    }
    // Checks if capacity <= cars on road.
    public boolean isFull(){
        return false;
    }

}
