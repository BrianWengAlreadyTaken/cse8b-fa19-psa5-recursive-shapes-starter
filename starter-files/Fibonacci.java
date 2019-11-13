import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class Fibonacci
{
    // every arc is a quarter circle
    static final int arcLength = 90;

    public static void draw(Group group, 
                            int centerX, int centerY,
                            int prevRadius, int currRadius,
                            int startAngle,
                            int n)
    {
        if (n == 0) return;

        Arc a = new Arc(centerX, centerY, currRadius, currRadius, 
                        startAngle, arcLength);
        a.setType(ArcType.ROUND);
        a.setFill(null);
        a.setStroke(Color.BLACK);
        group.getChildren().add(a);

        // TODO 
        // calculate any new values needed, then make a recursive call
    }
}