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

/**
 * Good job screen
 * 
 * @author Zachary Chang
 * @version July 24, 2016
 */
public class PuzzleHouseComponentGood extends JComponent
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
     Color mediumviolet = new Color(199, 21, 133);
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 15));
     g2.setColor(black);
     g2.drawString("Hey, good job :)", 10, 20);
     
     Ellipse2D.Double face = new Ellipse2D.Double(75, 75, 250, 250);
     g2.draw(face);
     g2.setColor(yellow);
     g2.fill(face);
     
     Ellipse2D.Double leftOutEye = new Ellipse2D.Double(110, 125, 75, 75);
     g2.draw(leftOutEye);
     g2.setColor(white);
     g2.fill(leftOutEye);
     
     Ellipse2D.Double rightOutEye = new Ellipse2D.Double(210, 125, 75, 75);
     g2.draw(rightOutEye);
     g2.setColor(white);
     g2.fill(rightOutEye);
     
     Ellipse2D.Double leftInEye = new Ellipse2D.Double(120, 130, 40, 40);
     g2.draw(leftInEye);
     g2.setColor(black);
     g2.fill(leftInEye);
     
     Ellipse2D.Double rightInEye = new Ellipse2D.Double(240, 155, 40, 40);
     g2.draw(rightInEye);
     g2.setColor(black);
     g2.fill(rightInEye);
     
     Ellipse2D.Double inMouth = new Ellipse2D.Double(162, 200, 80, 80);
     g2.draw(inMouth);
     g2.setColor(mediumviolet);
     g2.fill(inMouth);
    }
}
