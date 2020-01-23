
/**
 * Displays components of the mysterious puzzle house.
 * 
 * @author Zachary Chang
 * @version July 19, 2016
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

public class PuzzleHouseComponent extends JComponent 
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
     
     Rectangle grayScreen = new Rectangle(0, 0, 1000, 1000);
     g2.draw(grayScreen);
     g2.setColor(darkgray);
     g2.fill(grayScreen);
     
     Ellipse2D.Double monsterHead = new Ellipse2D.Double(275, 250, 200, 200);
     g2.draw(monsterHead);
     g2.setColor(black);
     g2.fill(monsterHead);
     
     Ellipse2D.Double monsterEye1 = new Ellipse2D.Double(315, 280, 30, 30); 
     g2.draw(monsterEye1);
     g2.setColor(white);
     g2.fill(monsterEye1);
     
     Ellipse2D.Double monsterEye2 = new Ellipse2D.Double(408, 280, 30, 30);  
     g2.draw(monsterEye2);
     g2.setColor(white);
     g2.fill(monsterEye2);
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 30));
     g2.setColor(lightgray);
     g2.drawString("PuZzLe HoUsE", 260, 225);
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 25)); 
     g2.setColor(blue);
     g2.drawString("CLICK THE START BUTTON TO BEGIN", 145, 520);
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 15)); 
     g2.setColor(yellow);
     g2.drawString("Drag the screens away from each other so you can see everything at once as you progress.", 37, 550);
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 30));
     g2.setColor(red);
     g2.drawString("3", 60, 100);  
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 40));
     g2.setColor(red);
     g2.drawString("8", 600, 200);
     
     g2.setFont(new Font("Verdana", Font.PLAIN, 25));
     g2.setColor(red);
     g2.drawString("1", 550, 600);
     
   } 
}
