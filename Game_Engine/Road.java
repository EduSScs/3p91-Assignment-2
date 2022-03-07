package Game_Engine;
import Traffic_Game.*;
import java.util.*;

public class Road {

    // start and end intersection
    public Intersection start;

    public Intersection end;
    // vehicle queue
    public Queue<Vehicle> vehicles;

    public int capacity;


    // roads are queues that hold vehicles. roads have a start and end intersection

    public Road (Intersection start, Intersection end) {
        this.start = start;
        this.end = end;
        this.vehicles = vehicles;
        this.capacity = 0;
    }

    // add a vehicle to the road
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    // remove a vehicle from the road
    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    // get the next vehicle in the road
    public Vehicle getNextVehicle() {
        return vehicles.peek();
    }

    // get the start intersection
    public Intersection getStart() {
        return start;
    }

    // get the end intersection
    public Intersection getEnd() {
        return end;
    }

    // get the capacity of the road
    public int getCapacity() {
        return vehicles.size();
    }

    // get the current occupation fo the road
    public int getOccupation() {
        return vehicles.size();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //before adding a new car to the queue, make sure it's not past capacity
    // if it is. block the car
    public void checkCapacity() {
        if (vehicles.size() == capacity) {
            System.out.println("The road is full");
        }

        
    }


}
