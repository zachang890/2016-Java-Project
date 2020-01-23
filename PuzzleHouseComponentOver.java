
/**
 * Fail Screen
 * 
 * @author Zachary Chang 
 * @version July 25, 2016
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.Font;
import java.util.*;
public class PuzzleHouseComponentOver extends JComponent
{
    public void paintComponent(Graphics g)
    {
     Graphics2D g2 = (Graphics2D) g;
        
     Color blue = new Color(0, 0, 255);//standard color
     Color darkgray = new Color(64, 64, 64);//standard color
     Color yellow = new Color(255, 255, 0);//standard color
     Color black = new Color(0, 0, 0);//standard color
     Color lightgray = new Color(192, 192, 192);//standard color
     Color white = new Color(255, 255, 255);//standard color
     Color pink = new Color(255, 175, 175);//standard color
     Color red = new Color(255, 0, 0);//standard color
     Color darkwhite = new Color(230, 230, 230);//custom color
     Color peach = new Color(235, 160, 0);//custom color
     Color brown = new Color(155, 90, 80);//custom color 
     Color gainsboro = new Color(220, 220, 220);//custom color
     Color maroon = new Color(128, 0, 0);//custom color
     Color moccasin = new Color(255, 228, 181); //custom color
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 50));
     g2.setColor(red);
     g2.drawString("START OVER", 30, 200);
    }
}
