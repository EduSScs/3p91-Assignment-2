package Game_Engine;

public class Intersection {


    boolean [] directions = new boolean[3]; // Can you turn left, right, not turn..\
    double x;
    double y;

    // Network class should be able to create a intersection at specific cords.

    public boolean[] getDirections() {
        return directions;
    }

    // Get coordinates of this intersection
    public double[] getCoords() {
        double[] coords= new double[1];
        coords[0] = x;
        coords[1] = y;
        return coords;
    }

}
