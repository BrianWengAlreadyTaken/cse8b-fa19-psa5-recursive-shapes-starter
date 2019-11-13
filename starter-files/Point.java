/**
 * File: Point.java
 * Author: Charles Tianchen Yu
 *
 * DO NOT MODIFY.
 */

/**
 * This class defines a point in the Cartesian plane. 
 * A point is defined by an x and a y coordinate.
 */
public class Point
{
    private int x;
    private int y;

    private static final String TO_STRING_FMT = "Point: (%d, %d)";

    /**
     * Default constructor, initializes (0,0)
     */
    public Point()
    {
        this(0, 0);
    }

    /**
     * Constructor that sets a specific coordinate
     * 
     * @param  x the x-coord
     * @param  y the y-coord
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * (Deep) copy constructor
     * @param  other the Point to be copied
     */
    public Point(Point other)
    {
        this(other.getX(), other.getY());
    }

    /**
     * Getter for the x-coordinate
     * @return the x-coord of this Point
     */
    public int getX()
    {
        return x;
    }

    /**
     * Getter for the y-coordinate
     * @return the y-coord of this Point
     */
    public int getY()
    {
        return y;
    }

    /**
     * Setter for the x-coord
     * @param x the new x-coord
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Setter for the y-coord
     * @param y the new y-coord
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Returns the String representation of this Point
     * 
     * @return "Point: (X, Y)"
     */
    public String toString()
    {
        return String.format(TO_STRING_FMT, getX(), getY());
    }
}