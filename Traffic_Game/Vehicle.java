package Traffic_Game;

public class Vehicle {

    private double speed;
    public double damage;
    public int size;

    public double getSpeed() {
        return speed;
    }
    public void accelerate() {
        speed++;
    }

    public void turn(int direction) {
        // Depending on the direction, negative left, 0 straight, 1 right.
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

}

