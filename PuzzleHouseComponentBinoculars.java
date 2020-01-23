
/**
 * Defines the binoculars scene in the puzzle house.
 * 
 * @author Zachary Chang
 * @version July 22, 2016
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

public class PuzzleHouseComponentBinoculars extends JComponent
{
    public void paintComponent(Graphics g)
    {
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
     
     Rectangle blackOut = new Rectangle(0, 0, 1100, 1100);
     g2.draw(blackOut);
     g2.setColor(black);
     g2.fill(blackOut);
     
     Ellipse2D.Double leftOpen = new Ellipse2D.Double(50, 75, 150, 150);
     g2.draw(leftOpen);
     g2.setColor(darkblue);
     g2.fill(leftOpen);
     
     Ellipse2D.Double rightOpen = new Ellipse2D.Double(200, 75, 150, 150);
     g2.draw(rightOpen);
     g2.setColor(darkblue);
     g2.fill(rightOpen);
     
     Ellipse2D.Double moon = new Ellipse2D.Double(250, 100, 75, 75);
     g2.draw(moon);
     g2.setColor(lightyellow);
     g2.fill(moon);
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 15));
     g2.setColor(yellow);
     g2.drawString("Numbers are hidden in all sorts of things.", 10, 20);
     g2.drawString("There are lots of circles here.", 185, 350);
     
     Ellipse2D.Double star = new Ellipse2D.Double(90, 90, 5, 5);
     g2.draw(star);
     g2.setColor(white);
     g2.fill(star);
     
     Ellipse2D.Double star1 = new Ellipse2D.Double(110, 110, 5, 5);
     g2.draw(star1);
     g2.setColor(white);
     g2.fill(star1);
     
     Ellipse2D.Double star2 = new Ellipse2D.Double(165, 100, 5, 5);
     g2.draw(star2);
     g2.setColor(white);
     g2.fill(star2);
     
     Ellipse2D.Double star3 = new Ellipse2D.Double(140, 130, 5, 5);
     g2.draw(star3);
     g2.setColor(white);
     g2.fill(star3);
     
     Ellipse2D.Double star4 = new Ellipse2D.Double(135, 150, 5, 5);
     g2.draw(star4);
     g2.setColor(white);
     g2.fill(star4);
     
     Ellipse2D.Double star5 = new Ellipse2D.Double(100, 200, 5, 5);
     g2.draw(star5);
     g2.setColor(white);
     g2.fill(star5);
     
     g2.drawString("...the moon...", 100, 275);
     g2.drawString("...the stars...", 135, 315);
    }
}
