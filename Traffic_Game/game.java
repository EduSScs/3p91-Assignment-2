package Traffic_Game;

import Game_Engine.*;

public class game {

    public static void main(String[] args) {
        Game_Engine.Network n = new Game_Engine.Network();
        // create a loop that runs until the games over (because the player crashed)
        while (n.isRunning) {
            // call the step function
            n.step();
        }
    }

}

