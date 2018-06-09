package model;

public class MEllipse extends MShape{

    public double getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(double radiusX) {
        this.radiusX = radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(double radiusY) {
        this.radiusY = radiusY;
    }

    private double radiusX;
    private double radiusY;

    /**
     * Constructs a circle with the given origin and the given radius
     *
     * @param x
     *            the x-coordinate of the shape's origin
     * @param y
     *            the y-coordinate of the shape's origin
     * @param radiusX
     *            half of the length
     * @param radiusY
     *            half of the width
     *
     */

    public MEllipse(double x, double y , double radiusX, double radiusY) {
        super(x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    /**
     * calculate the area of a circle.
     *
     * @return the area of the circle
     */
    @Override
    public double area() {
        return (Math.PI * (2 * this.radiusX) * (2 * this.radiusY));
    }

    /**
     * calculate the circumference of a circle.
     *
     * @return the circumference of the circle
     */
    @Override
    public double circumference() {
        return (Math.PI * Math.sqrt(2 * (Math.pow(2 * radiusX, 2) + Math.pow(2 * radiusY, 2))));
    }

    /**
     * constructs a textual representation of this circle.
     *
     * @return the current object in a textual representation
     */
    @Override
    public String toString() {
        return "Ellipse with origin: " + origin() +
                ", radiusX: " + this.radiusX + ", radiusY: ";
    }

}
