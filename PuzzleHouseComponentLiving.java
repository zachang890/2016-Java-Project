
/**
 * The art portion of creating the house's living room.
 * 
 * @author Zachary Chang
 * @version July 23, 2016
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

public class PuzzleHouseComponentLiving extends JComponent
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
     
     Rectangle background = new Rectangle(0, 0, 1100, 1100);
     g2.draw(background);
     g2.setColor(gainsboro);
     g2.fill(background);
     
     Line2D.Double groundLine = new Line2D.Double(0, 300, 384, 300);
     g2.setColor(black);
     g2.draw(groundLine);
     
     Rectangle fireFrameOut = new Rectangle(102, 210, 180, 90);
     g2.draw(fireFrameOut);
     g2.setColor(maroon);
     g2.fill(fireFrameOut);
     
     Rectangle fireFrameIn = new Rectangle(122, 230, 140, 70);
     g2.draw(fireFrameIn);
     g2.setColor(darkgray);
     g2.fill(fireFrameIn);
     
     Rectangle lightHangMid = new Rectangle(172, 0, 40, 10);
     g2.draw(lightHangMid);
     g2.setColor(white);
     g2.fill(lightHangMid);
     
     Line2D.Double midLight = new Line2D.Double(192, 10, 192, 100);
     g2.setColor(black);
     g2.draw(midLight);
     
     Ellipse2D.Double midBulb = new Ellipse2D.Double(187, 112, 10, 10);
     g2.draw(midBulb);
     g2.setColor(yellow);
     g2.fill(midBulb);
     
     Rectangle midLightCov = new Rectangle(162, 100, 60, 15);
     g2.draw(midLightCov);
     g2.setColor(moccasin);
     g2.fill(midLightCov);
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 15));
     g2.setColor(black);
     g2.drawString("What could this mean?", 10, 20);
     
     g2.setFont(new Font("Complex", Font.PLAIN, 10));
     g2.setColor(black);
     g2.drawString("(Opposite of up) and to the ", 13, 40);
     g2.drawString("(Opposite of Left) on the ", 14, 70);
     g2.drawString("(People type with this)", 16, 100);
     g2.drawString("5  2  9", 20, 130);
     
     Rectangle pic1Out = new Rectangle(184, 180, 16, 30);
     g2.draw(pic1Out);
     g2.setColor(brown);
     g2.fill(pic1Out);
     
     Rectangle pic1In = new Rectangle(187, 183, 10, 24);
     g2.draw(pic1In);
     g2.setColor(darkgray);
     g2.fill(pic1Out);
     
     Rectangle log = new Rectangle(167, 280, 50, 20);
     g2.draw(log);
     g2.setColor(brown);
     g2.fill(log);
     
     int[] xCoords = {305, 320, 350, 365};
     int[] yCoords = {160, 140, 140, 160};
     Polygon lampCov = new Polygon(xCoords, yCoords, 4);
     g2.draw(lampCov);
     g2.setColor(peach);
     g2.fill(lampCov);
     
     int[] x = {305, 365, 385, 285};
     int[] y = {160, 160, 300, 300};
     Polygon light = new Polygon(x, y, 4);
     g2.draw(light);
     g2.setColor(yellow);
     g2.fill(light);
     
     Rectangle lampBot = new Rectangle(300, 290, 70, 10);
     g2.draw(lampBot);
     g2.setColor(blue);
     g2.fill(lampBot);
     
     Rectangle rod = new Rectangle(333, 160, 4, 130);
     g2.draw(rod);
     g2.setColor(black);
     g2.fill(rod);
    }
}
