package Game_Engine;

public class GameEngine {

    public int time;
    public int points;

    public void addPoints() {
        points++;
    }
    public void subPoints(int p) {
        points -= p;
    }
    private void advance() {
        time ++;
    }

    public int getTime() {
        return time;
    }

    private boolean checkCollisions() {
        // Check to see if there's any collisions
        return false;
    }


}
