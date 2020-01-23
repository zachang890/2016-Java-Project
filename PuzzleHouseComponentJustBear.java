
/**
 * Reveals that it is a bear.
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
import javax.swing.*;

public class PuzzleHouseComponentJustBear extends JComponent
{
    public void paintComponent(Graphics g) {
     Graphics2D g2 = (Graphics2D) g;
     
     Color red = new Color(255, 0, 0);//standard color
     Color orange = new Color(255, 128, 0);//standard color
     Color yellow = new Color(255, 255, 0);//standard color
     Color green = new Color(0, 255, 0);//standard color
     Color blue = new Color(0, 0, 255);//standard color
     Color purple = new Color(153, 0, 153);//standard color
     Color brown = new Color(155, 90, 80);//custom color
     Color darkgray = new Color(64, 64, 64);//standard color
     Color black = new Color(0, 0, 0);//standard color
     Color lightgray = new Color(192, 192, 192);//standard color
     Color white = new Color(255, 255, 255);//standard color
     Color pink = new Color(255, 175, 175);//standard color
     Color darkwhite = new Color(230, 230, 230);//custom color
     Color peach = new Color(235, 160, 0);//custom color
     Color lightyellow = new Color(255, 255, 153);//custom color
     Color darkblue = new Color(15, 7, 63); 
     Color mediumviolet = new Color(199, 21, 133);
     
     Rectangle dark = new Rectangle(0, 0, 1100, 1100);
     g2.draw(dark);
     g2.setColor(darkgray);
     g2.fill(dark);
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 18));
     g2.setColor(yellow);
     g2.drawString("Oh, it's just a stuffed bear :)", 225, 400);
     
     Ellipse2D.Double face = new Ellipse2D.Double(75, 75, 250, 250);
     g2.draw(face);
     g2.setColor(brown);
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
