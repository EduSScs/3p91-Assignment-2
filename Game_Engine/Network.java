package Game_Engine;

import Traffic_Game.Vehicle;
import UI.*; //to be used later. 

public class Network {


    //int x, y;
    Road[][]graph;
    Intersection[][]inter_graph;
    public Network(){
        Read_Graph();
        display();
        for(int i=0; i<10; i++){
            Traffic_Game.Vehicle x = new Traffic_Game.Vehicle();
            x.size = 1;
            
        }
    }

    public void display() {
        // For each interesection and road, draw a connection.
        // For each road, change color depending on capacity.
        for (int x = 0; x < graph.length; x++) {
            for (int y = 0; y < graph[x].length; y++) {
               if (graph[x][y].capacity==0){
                    System.out.print("■");
               }
               if (graph[x][y].capacity>0){
                System.out.print(" ");
           }
            }
            System.out.println();
         }
    }

    private void Read_Graph() {
        // Take user input to generate a road map.
        /*graph = new boolean[][] {{false,true,false,true,false,true,false,true,false,true,false},
                            {true,true,true,true,true,true,true,true,true,true},
                            {false,true,false,true,false,true,false,true,false,true,false},
                            {true,true,true,true,true,true,true,true,true,true},
                            {false,true,false,true,false,true,false,true,false,true,false},
                            {true,true,true,true,true,true,true,true,true,true},
                            {false,true,false,true,false,true,false,true,false,true,false},
                            {true,true,true,true,true,true,true,true,true,true},
                            {false,true,false,true,false,true,false,true,false,true,false},
                            {true,true,true,true,true,true,true,true,true,true}
                            };
    }*/
    /*graph = new double[][] {{0,10,0,10,0,10,0,10,0,10,0},
                            {10,10,10,10,10,10,10,10,10,10},
                            {0,10,0,10,0,10,0,10,0,10,0},
                            {10,10,10,10,10,10,10,10,10,10},
                            {0,10,0,10,0,10,0,10,0,10,0},
                            {10,10,10,10,10,10,10,10,10,10},
                            {0,10,0,10,0,10,0,10,0,10,0},
                            {10,10,10,10,10,10,10,10,10,10},
                            {0,10,0,10,0,10,0,10,0,10,0},
                            {10,10,10,10,10,10,10,10,10,10}
                            };*/
    graph = new Road[10][10];
    for (int x = 0; x < graph.length; x++) {
        for (int y = 0; y < graph[x].length; y++) {
           if((x%2==0)&&(y%2==0)){
                graph[x][y] = new Road();
                graph[x][y].capacity = 0;
           }
           else{
            graph[x][y] = new Road();
            graph[x][y].capacity = 10;
           }
        }
     }

     inter_graph = new Intersection{{}}

    }
}
