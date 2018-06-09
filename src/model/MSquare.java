package model;

public class MSquare extends MShape{

    private double xDelta;

    /**
     * constructs a rectangle object
     *
     * @param xOrigin
     *            the x-coordinate of the shape's origin
     * @param yOrigin
     *            the y-coordinate of the shape's origin
     * @param xDelta
     *            half of the length
     *
     */

    public MSquare(double xOrigin, double yOrigin, double xDelta) {
        super(xOrigin, yOrigin);
        this.xDelta = xDelta;
    }

    /**
     * returns half the length of the rectangle
     * @return half the length
     */

    public double getXDelta() {
        return xDelta;
    }


    /**
     * calculate the area of this rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        return 4 * this.xDelta;
    }

    /**
     * calculate the circumference of this rectangle.
     *
     * @return the circumference of the rectangle
     */
    @Override
    public double circumference() {
        return 8 * this.xDelta;
    }

    /**
     * constructs a textual representation of the object.
     *
     * @return the current object in a textual representation
     */
    @Override
    public String toString() {
        return "Square with origin: " + origin() +
                ", xDelta: " + this.xDelta + ", yDelta: ";
    }
}
