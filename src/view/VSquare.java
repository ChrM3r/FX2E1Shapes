package view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.MShape;
import model.MSquare;

public class VSquare {
    /**
     * expects a MSquare-Object and returns its graphical representation
     * as a Rectangle-Object
     * @param s a MSquare-Object
     * @return the Rectangle-Object that represents s
     */

    public static Rectangle getShape(MShape s) {
        MSquare ssq = (MSquare) s;
        Rectangle rec = new Rectangle(ssq.getXOrigin(),
                ssq.getYOrigin(), 2*ssq.getXDelta(), 2*ssq.getXDelta());
        //color red is made transparent
        //so that overlapping shapes are visible
        rec.setFill(Color.rgb(0, 0, 255, 0.15));
        return rec;
    }
}
