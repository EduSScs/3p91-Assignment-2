package Traffic_Game;

public class Player extends Vehicle {

    public double reputation;

    public void reduceRep() {
        reputation--;
    }

    public void increaseRep() {
        reputation++;
    }

    public double getReputation() {
        return reputation;
    }



}