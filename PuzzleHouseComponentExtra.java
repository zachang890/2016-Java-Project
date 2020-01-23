
/**
 * Extra numbers puzzle
 * 
 * @author Zachary Chang
 * @version July 27, 2016
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

public class PuzzleHouseComponentExtra extends JComponent
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
     
     g2.setFont(new Font("Constantia", Font.PLAIN, 15));
     g2.setColor(yellow);
     g2.drawString("Homophones count too ;) Hint: There are nine numbers hidden.", 5, 15);
     g2.drawString("One day, Little Bear was walking to the forest to go find other bears.", 5, 35);
     g2.drawString("There were three bears that he wanted to find. Little bear chose...", 5, 55);
     g2.drawString("the dark path...", 5, 75);
     g2.drawString("Little bear knew for a fact that the other bears had pie!", 5, 95);
     g2.drawString("All he ate before the trip was a small cookie.", 5, 115);
     g2.drawString("He heard a sound, and WOOSH! SURPRISSEEE!", 5, 135);
     g2.drawString("Black bear, white eyes was back :O", 5, 155);
     
    }
}
