package Game_Engine;

import Traffic_Game.Vehicle;
import Game_Engine.Intersection;
import UI.*; //to be used later. 
//import random
import java.util.*;


public class Network {

    // Create a traffic network consisting of intersections with random coordinates and roads which connect them
    //create a list object called intersections
    public ArrayList<Intersection> intersections;
    public ArrayList<Road> roads;
    int numIntersections;
    public boolean hasCrash = false;

    public Network(int numIntersections) {
        this.numIntersections = numIntersections;
        createIntersections(numIntersections);
        // randomly fill out the roads
        for (int i = 0; i<(numIntersections * 3); i++) {
            // randomly choose an intersection
            int rand = (int) (Math.random() * numIntersections);
            // randomly choose an intersection
            int rand2 = (int) (Math.random() * numIntersections);
            // create a road between the two intersections
            // the capacity should be the distance between the two intersections
            int capacity = (int) Math.sqrt(Math.pow(intersections.get(rand).getX() - intersections.get(rand2).getX(), 2) + Math.pow(intersections.get(rand).getY() - intersections.get(rand2).getY(), 2));
            roads.add(createRoad(intersections.get(rand), intersections.get(rand2), capacity));
            // add the road to the list of roads;
        }
    }


    public void createIntersections(int numIntersections) {
        for (int i = 0; i < numIntersections; i++) {
            // x and y coordinates are random
            double x = (Math.random() * 1000);
            double y = (Math.random() * 1000);

/// or let user input the coordinates

            Intersection intersection = new Intersection(x, y);
            //add intersection to the list of intersections
            intersections.add(intersection);

        }

    }

    public Road createRoad(Intersection start, Intersection end, int capacity) {
        // create roads between intersections
        // randomly select two intersections and create a road between them
        Road r = new Road(start, end);
        // set the max capacity of the road queue to be the capacity parameter
        r.setCapacity(capacity);

        // put a random number of vehicles on the road (between 0 and the capacity)
        for (int i = 0; i < (int) (Math.random() * capacity); i++) {
            // create a new vehicle with a int size
            Vehicle v = new Vehicle((int) (Math.random() * 2));
            // add the vehicle to the road
            r.addVehicle(v);
        }

        return r;

    }

    public void checkCollisions(){
        // if user turned into a full road, crash
        if (hasCrash) {
            hasCrash = true;
        }
    }

    public void advance() {
        // for every road in the network, remove the first vehicle from the road and add it to the next road
    }

    public void display() {
        // write the current capacity of each road to the console
        for (Road r : roads) {
            System.out.println(r.getCapacity());
        }

    }

}
