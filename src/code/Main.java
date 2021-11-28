package code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String grid0 = "5,5;2;3,4;1,2;0,3,1,4;2,3;4,4,0,2,0,2,4,4;2,2,91,2,4,62";
//        String grid2 = "5,5;2;3,2;0,1;4,1;0,3;1,2,4,2,4,2,1,2,0,4,3,0,3,0,0,4;1,1,77,3,4,34";
//        String grid3 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,1";
//        String grid4 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,98,1,0,98";
//        String grid5 = "5,5;2;0,4;3,4;3,1,1,1;2,3;3,0,0,1,0,1,3,0;4,2,54,4,0,85,1,0,43";
//        String grid6 = "5,5;2;3,0;4,3;2,1,2,2,3,1,0,0,1,1,4,2,3,3,1,3,0,1;2,4,3,2,3,4,0,4;4,4,4,0,4,0,4,4;1,4,57,2,0,46";
//        String grid9 = "5,5;2;0,4;1,4;0,1,1,1,2,1,3,1,3,3,3,4;1,0,2,4;0,3,4,3,4,3,0,3;0,0,30,3,0,80,4,4,80";

//        String grid0 = "5,5;2;3,4;1,2;0,3,1,4;2,3;4,4,0,2,0,2,4,4;2,2,91,2,4,62";
//        String grid1 = "5,5;1;1,4;1,0;0,4;0,0,2,2;3,4,4,2,4,2,3,4;0,2,32,0,1,38";
//        String grid2 = "5,5;2;3,2;0,1;4,1;0,3;1,2,4,2,4,2,1,2,0,4,3,0,3,0,0,4;1,1,77,3,4,34";
//        String grid3 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,1";
//        String grid4 = "5,5;1;0,4;4,4;0,3,1,4,2,1,3,0,4,1;4,0;2,4,3,4,3,4,2,4;0,2,98,1,2,98,2,2,98,3,2,98,4,2,98,2,0,98,1,0,98";
//        String grid5 = "5,5;2;0,4;3,4;3,1,1,1;2,3;3,0,0,1,0,1,3,0;4,2,54,4,0,85,1,0,43";
//        String grid6 = "5,5;2;3,0;4,3;2,1,2,2,3,1,0,0,1,1,4,2,3,3,1,3,0,1;2,4,3,2,3,4,0,4;4,4,4,0,4,0,4,4;1,4,57,2,0,46";
//        String grid7 = "5,5;3;1,3;4,0;0,1,3,2,4,3,2,4,0,4;3,4,3,0,4,2;1,4,1,2,1,2,1,4,0,3,1,0,1,0,0,3;4,4,45,3,3,12,0,2,88";
//        String grid8 = "5,5;2;4,3;2,1;2,0,0,4,0,3,0,1;3,1,3,2;4,4,3,3,3,3,4,4;4,0,17,1,2,54,0,0,46,4,1,22";
//        String grid9 = "5,5;2;0,4;1,4;0,1,1,1,2,1,3,1,3,3,3,4;1,0,2,4;0,3,4,3,4,3,0,3;0,0,30,3,0,80,4,4,80";
//        String grid10 = "5,5;4;1,1;4,1;2,4,0,4,3,2,3,0,4,2,0,1,1,3,2,1;4,0,4,4,1,0;2,0,0,2,0,2,2,0;0,0,62,4,3,45,3,3,39,2,3,40";

        String grid0 = "5,5;2;4,3;2,1;2,0,0,4,0,3,0,1;3,1,3,2;4,4,3,3,3,3,4,4;4,0,17,1,2,54,0,0,46,4,1,22";
        String grid1 = "5,5;1;1,4;1,0;0,4;0,0,2,2;3,4,4,2,4,2,3,4;0,2,32,0,1,38";
        String grid2 = "8,8;1;2,4;5,3;0,4,1,4,3,0,7,7,5,6;0,1,1,3;4,4,3,1,3,1,4,4,0,7,7,0,7,0,0,7;0,2,28,4,0,30,5,5,5";
        String grid3 = "6,6;2;2,4;2,2;0,4,1,4,3,0,4,2;0,1,1,3;4,4,3,1,3,1,4,4;0,0,94,1,2,38,4,1,76,4,0,80";
        String grid4 = "7,7;3;0,0;0,6;0,3,0,4,2,3,4,5,6,6,5,4;0,2,4,3;2,0,0,5,0,5,2,0;1,0,83,2,5,38,6,4,66,2,6,20";
        String grid5 = "5,5;2;0,4;1,4;0,1,1,1,2,1,3,1,3,3,3,4;1,0,2,4;0,3,4,3,4,3,0,3;0,0,30,3,0,80,4,4,80";
        String grid6 = "6,6;2;2,2;2,4;0,1,1,0,3,0,4,1,4,3,3,4,1,4,0,3;0,2;1,3,4,2,4,2,1,3;0,0,2,0,4,2,4,0,2,4,4,98,1,1,98";
        String grid7 = "7,7;4;3,3;0,2;0,1,1,0,1,1,1,2,2,0,2,2,2,4,2,6,1,4;5,5,5,0;5,1,2,5,2,5,5,1;0,0,98,3,2,98,4,4,98,0,3,98,0,4,98,0,5,98,5,4,98";
        String grid8 = "7,7;4;5,3;2,5;0,0,0,2,0,6,2,3,5,1;1,1,2,6,6,0;4,0,1,6,1,6,4,0;0,4,33,1,4,1,4,3,11,5,4,2,5,5,69,3,1,95";
        String grid9 = "7,7;3;4,3;3,2;1,0,1,1,1,3,2,5,5,3,5,5;4,2,2,6,6,2,4,4;1,4,6,4,6,4,1,4,4,0,6,6,6,6,4,0,6,0,0,6,0,6,6,0;0,2,98,1,5,26,3,3,70,6,3,90,6,5,32";
        String grid10 = "6,6;1;2,2;2,4;0,1,1,0,3,0,4,1,4,3,3,4,1,4,0,3,1,5;0,2;1,3,4,2,4,2,1,3;0,5,90,1,2,92,4,4,2,5,5,1,1,1,98";
        String grid11 = "9,9;2;8,0;3,5;0,1,0,3,1,0,1,1,1,2,0,7,1,8,3,8,6,1,6,5;0,6,2,8;8,1,4,5,4,5,8,1;0,0,95,0,2,98,0,8,94,2,5,13,2,6,39";

        String[] strats = new String[]{"BF", "DF", "ID", "UC", "GR1", "GR2", "AS1", "AS2"};

        String grid = grid1;

        for (int i = 0; i < 1; i++) {
            System.out.println(strats[i] + ":");
            System.out.println(Matrix.solve(grid, strats[i], true));
            System.out.println();
        }

    }
}
