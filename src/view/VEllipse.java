package view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import model.MEllipse;
import model.MShape;

public class VEllipse {
    /**
     * expects a MSquare-Object and returns its graphical representation
     * as a Rectangle-Object
     * @param s a MSquare-Object
     * @return the Rectangle-Object that represents s
     */

    public static Ellipse getShape(MShape s) {
        MEllipse sell = (MEllipse) s;
        Ellipse ell = new Ellipse(sell.getXOrigin(),
                sell.getYOrigin(), sell.getRadiusX(), sell.getRadiusY());
        //color red is made transparent
        //so that overlapping shapes are visible
        ell.setFill(Color.rgb(0, 0, 255, 0.15));
        return ell;
    }
}
