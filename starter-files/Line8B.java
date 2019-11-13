/**
 * File: Line8B.java
 * Author: Charles Tianchen Yu
 *
 * DO NOT MODIFY.
 */
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

/**
 * This class defines a line segment in the Cartesian plane. 
 * A line segment is defined by a start and end point, each 
 * of which is represented by a Point object. 
 */
public class Line8B extends Shape
{
    private Point start;
    private Point end;

    private static final String DEFAULT_LINE8B_NAME = "NoName";
    private static final String TO_STRING_FMT = "Line8B: %s; Start: %s; End: %s";
    private static final int LINE_STROKE = 3;

    /**
     * Default constructor. Creates a line segment from (0,0) to (0,0) with the 
     * name "NoName"
     */
    public Line8B()
    {
        this(new Point(0,0), new Point(0,0));
    }

    /**
     * Creates a line segment between the specified points with the name 
     * "NoName"
     * 
     * @param  start the starting Point of the line segment
     * @param  end   the ending Point of the line segment
     */
    public Line8B(Point start, Point end)
    {
        this(start, end, DEFAULT_LINE8B_NAME);
    }

    /**
     * Creates a line segment between the specified points with the 
     * specified name
     * 
     * @param  start the starting Point of the line segment
     * @param  end   the ending Point of the line segment
     * @param  name  the name of this object
     */
    public Line8B(Point start, Point end, String name)
    {
        super(name);
        this.start = new Point(start);
        this.end = new Point(end);
    }

    /**
     * Copy constructor, copies the given Line8B but 
     * uses the name "NoName"
     * 
     * @param  other the Line8B to copy
     */
    public Line8B(Line8B other)
    {
        this(other, DEFAULT_LINE8B_NAME);
    }

    /**
     * Copy constructor, copies the given Line8B and 
     * names it the specified name
     * 
     * @param  other the Line8B to copy
     * @param  name  the name of this object
     */
    public Line8B(Line8B other, String name)
    {
        this(other.getStart(), other.getEnd(), name);
    }

    /**
     * Getter for the start point of this object
     * 
     * @return direct reference to the start Point
     */
    public Point getStart()
    {
        return start;
    }

    /**
     * Getter for the end point of this object
     * 
     * @return direct reference to the end Point
     */
    public Point getEnd()
    {
        return end;
    }

    /**
     * Setter for the start point of this object. Makes a shallow copy 
     * of the argument. 
     * 
     * @param start the new start Point
     */
    public void setStart(Point start)
    {
        this.start = start;
    }

    /**
     * Setter for the end point of this object. Makes a shallow copy 
     * of the argument. 
     * 
     * @param end the new end Point
     */
    public void setEnd(Point end)
    {
        this.end = end;
    }

    /**
     * Draws this object to the specified group with the 
     * specified color and fill property. 
     * 
     * @param group the group to draw to
     * @param color the color of this line
     * @param fill  filled or not filled (doesn't matter for this object)
     */
    public void draw(Group group, Color color, boolean fill)
    {
        Line line = new Line();
        line.setStartX(start.getX());
        line.setStartY(start.getY());
        line.setEndX(end.getX());
        line.setEndY(end.getY());
        line.setStrokeWidth(LINE_STROKE); //otherwise line is too thin to see
        line.setStroke(color);
        group.getChildren().add(line);
    }

    /**
     * Returns the String representation of this Line8B
     * 
     * @return "Line8B: NAME; Start: Point: (X, Y); End: Point: (X, Y)"
     */
    public String toString()
    {
        return String.format(TO_STRING_FMT, super.toString(), start.toString(),
            end.toString());
    }
}