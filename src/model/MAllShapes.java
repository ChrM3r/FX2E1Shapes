package model;

/**
 * a fabric for Shape-Objects.
 * @author Agathe Merceron
 */

import java.util.Arrays;

public class MAllShapes {

    /**
     * construct a number of Rectangle and Circle objects,
     * stores them in an array and returns it
     * @return an array filled with Rectangle or Circle objects
     */

    public static MShape[] getDefaultShapes(){
        MShape[] allshapes= new MShape[7];
        allshapes[0] = new MRectangle( 255, 125, 30, 25);
        allshapes[1] = new MRectangle( 155, 75, 10, 40);
        allshapes[2] = new MCircle( 80, 80, 10);
        allshapes[3] = new MRectangle( 45, 105, 80, 40);
        allshapes[4] = new MCircle( 200, 100, 50);
        allshapes[5] = new MSquare(300, 300, 100);
        allshapes[6] = new MEllipse(150 , 200, 40, 85);

        return allshapes;
    }

    public static void main(String[] args) {
        MShape[] mix =  MAllShapes.getDefaultShapes();
        System.out.println(Arrays.deepToString(mix));
    }

}