package Traffic_Game;

import java.util.*;
import Game_Engine.*;

public class game {

    public static void main(String[] args) {
        // create a new traffict network
        Network n = new Network(10); // 10 intersections game

        //while game isnt over, loop
        while (!n.hasCrash) {
            // advance the game
            n.advance();
            // check for collisions
            n.checkCollisions();

            // dispaly the current state of the game
            n.display();
            

        }
        
        
        
        }
    }



