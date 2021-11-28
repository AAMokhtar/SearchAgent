package code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String grid = Matrix.genGrid();
        String grid = "5,5;2;0,4;1,4;0,1,1,1,2,1,3,1,3,3,3,4;1,0,2,4;0,3,4,3,4,3,0,3;0,0,30,3,0,80,4,4,80";
        String grid0 = "5,5;2;3,4;1,2;0,3,1,4;2,3;4,4,0,2,0,2,4,4;2,2,91,2,4,62";
        String grid3 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,1";
        String grid4 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,98,1,0,98";
        String grid5 = "5,5;2;0,4;3,4;3,1,1,1;2,3;3,0,0,1,0,1,3,0;4,2,54,4,0,85,1,0,43";
        String grid6 = "5,5;2;3,0;4,3;2,1,2,2,3,1,0,0,1,1,4,2,3,3,1,3,0,1;2,4,3,2,3,4,0,4;4,4,4,0,4,0,4,4;1,4,57,2,0,46";
        String grid9 = "5,5;2;0,4;1,4;0,1,1,1,2,1,3,1,3,3,3,4;1,0,2,4;0,3,4,3,4,3,0,3;0,0,30,3,0,80,4,4,80";
        String[] strats = new String[]{"BF", "DF", "ID", "UC", "GR1", "GR2", "AS1", "AS2"};
//        System.out.println("lol");
        System.out.println(Matrix.solve(grid5, strats[0], true));
//        Neo n = new Neo(new Location(0,0),0,3,3);
//
//        ArrayList <Location>  agents = new ArrayList<Location>();
//        agents.add(new Location(1,1));
//
//        HashMap<Location, Location>  pads = new HashMap<Location, Location> ();
//        pads.put(new Location(2,2),new Location(3,2));
//
//        ArrayList <Location>  pills = new ArrayList<Location>();
//        pills.add(new Location(3,3));
//
//        Location TB = new Location(5,5);
//
//        Hostage h1 = new Hostage(new Location(0,1),10,false);
//        ArrayList <Hostage>  hostages = new ArrayList<Hostage>();
//        hostages.add(h1);
//
//        MatrixState s1=new MatrixState(new Location(6,6),n,hostages,agents,pads,pills,TB);
////////////////////////////////////////
//
//
//        MatrixState s2=new MatrixState(new Location(6,6),n,hostages,agents,pads,pills,TB);
//        HashSet<MatrixState> visitedStates = new HashSet<MatrixState>();
//        visitedStates.add(s1);
//        System.out.println(visitedStates.contains(s2));
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
        //lol man this is cool
//        Location gridDims, Neo neo, ArrayList<Hostage> hostages, ArrayList<Location> agentLocs,
//                HashMap<Location, Location> padLocs, ArrayList<Location> pillLocs, Location teleBoothLoc
    }
}
