
/**
 * Displays console window for the puzzle house.
 * 
 * @author Zachary Chang 
 * @version July 19, 2016
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PuzzleHouseViewer 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(800, 800);
        frame.setTitle("Puzzle House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PuzzleHouseComponent component = new PuzzleHouseComponent();
        frame.add(component);

        frame.setVisible(true);

        JFrame frame2 = new JFrame();

        frame2.setTitle("StartBox");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton start = new JButton("START!");
        JPanel panel = new JPanel();
        panel.add(start);
        frame2.add(panel);

        JFrame frame3 = new JFrame();

        frame3.setSize(400, 400);
        frame3.setTitle("Puzzle House Window");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentWindow component1 = new PuzzleHouseComponentWindow();
        frame3.add(component1);

        JFrame frame5 = new JFrame();
        frame5.setSize(400, 400);
        frame5.setTitle("Binoculars");
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentBinoculars component2 = new PuzzleHouseComponentBinoculars();
        frame5.add(component2);

        JFrame frame4 = new JFrame();

        frame4.setTitle("Binoculars");
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton binoculars = new JButton("Go to Binoculars");
        JPanel panel1 = new JPanel();
        panel1.add(binoculars);
        frame4.add(panel1);

        frame4.setSize(275, 100);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame frame6 = new JFrame();

        frame6.setTitle("Living Room");
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton living = new JButton("Go to Living Room");
        JPanel panel2 = new JPanel();
        panel2.add(living);
        frame6.add(panel2);

        JFrame frameCode1 = new JFrame();

        JPanel panel3 = new JPanel();
        JLabel lab = new JLabel("How many?");
        JTextField circles = new JTextField();
        circles.setColumns(20);
        panel3.add(circles);
        panel3.add(lab);
        frameCode1.add(panel3);
        frameCode1.setSize(275, 100);
        frameCode1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame frameCode2 = new JFrame();

        JPanel panel4 = new JPanel();
        JLabel lab1 = new JLabel("What is the secret Number?");
        JTextField secret = new JTextField();
        secret.setColumns(20);
        panel4.add(secret);
        panel4.add(lab1);
        frameCode2.add(panel4);
        frameCode2.setSize(275, 100);
        frameCode2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame done = new JFrame();

        JPanel panel5 = new JPanel();
        JLabel lab2 = new JLabel("Type yes if you are ready to move on!");
        JTextField ready = new JTextField();
        ready.setColumns(20);
        panel5.add(ready);
        panel5.add(lab2);
        done.add(panel5);
        done.setSize(275, 100);
        done.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame times = new JFrame();

        JPanel panel6 = new JPanel();
        JLabel lab3 = new JLabel("How many times have you seen this guy before now? (Once), (twice), or (three) times?");
        JTextField timey = new JTextField();
        timey.setColumns(20);
        panel6.add(timey);
        panel6.add(lab3);
        times.add(panel6);
        times.setSize(550, 100);
        times.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame ready2 = new JFrame();

        JPanel panel7 = new JPanel();
        JLabel lab4 = new JLabel("Type puzzle for a challenge.");
        JTextField readyy = new JTextField();
        readyy.setColumns(20);
        panel7.add(readyy);
        panel7.add(lab4);
        ready2.add(panel7);
        ready2.setSize(550, 100);
        ready2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame theNumb = new JFrame();

        JPanel panel8 = new JPanel();
        JLabel lab5 = new JLabel("Type in the numbers you see or hear in this paragraph as you read. (Your answer should be one long number)");
        JTextField numby = new JTextField();
        numby.setColumns(20);
        panel8.add(numby);
        panel8.add(lab5);
        theNumb.add(panel8);
        theNumb.setSize(680, 100);
        theNumb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame next = new JFrame();
        next.setSize(400, 400);
        next.setTitle(":) :D");
        next.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentGood componenty = new PuzzleHouseComponentGood();
        next.add(componenty);

        JFrame frame7 = new JFrame();
        frame7.setSize(400, 400);
        frame7.setTitle("Living Room");
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentLiving component3 = new PuzzleHouseComponentLiving();
        frame7.add(component3);

        JFrame who = new JFrame();

        who.setSize(500, 500);
        who.setTitle("Mystery Face");
        who.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentFace component4 = new PuzzleHouseComponentFace();
        who.add(component4);

        JFrame bear = new JFrame();

        bear.setSize(500, 500);
        bear.setTitle("Bear");
        bear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentJustBear component5 = new PuzzleHouseComponentJustBear();
        bear.add(component5);

        JFrame extra = new JFrame();

        extra.setSize(600, 600);
        extra.setTitle("Extra Word Puzzle");
        extra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentExtra component7 = new PuzzleHouseComponentExtra();
        extra.add(component7);

        JFrame thanks = new JFrame();
        thanks.setSize(400, 400);
        thanks.setTitle("Thank You");
        thanks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentThanks component6 = new PuzzleHouseComponentThanks();
        thanks.add(component6);

        class ClickListener implements ActionListener { // this is an inner class, i.e., inside main method
            int county = 0;
            int counter = 0;
            public void actionPerformed(ActionEvent event) { // override this method to respond
                Object obj = event.getSource();
                if(obj == start) {
                    frame.remove(component);
                    frame.repaint();
                    frame2.setVisible(false);
                    frame.setVisible(false);

                }

                if(obj != binoculars) {
                    frame3.setVisible(true);
                    frame4.setVisible(true);
                }

                else if(obj == binoculars) {
                    frame5.setVisible(true);
                    frame4.setVisible(false);
                    frame6.setVisible(true);
                }

                if(obj == living) {
                    frame6.setVisible(false);
                    frame7.setVisible(true);
                    frame4.setVisible(false);
                    frameCode1.setVisible(true);
                    frameCode2.setVisible(true);

                }

                frame6.setSize(275, 100);
                frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        }

        ActionListener listenerStart = new ClickListener();
        start.addActionListener(listenerStart);

        ActionListener listenerBino = new ClickListener();
        binoculars.addActionListener(listenerBino);

        ActionListener listenerLiv = new ClickListener();
        living.addActionListener(listenerLiv);

        JFrame fail = new JFrame();

        fail.setSize(400, 400);
        fail.setTitle("FAIL");
        fail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PuzzleHouseComponentOver componentFail = new PuzzleHouseComponentOver();
        fail.add(componentFail);

        Action action = new AbstractAction()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String circCont = circles.getText();
                    String secCont = secret.getText();
                    if(circCont.equals("15")&&secCont.equals("2")){
                        next.setVisible(true);
                        done.setVisible(true);
                        frameCode1.setVisible(false);
                        frameCode2.setVisible(false);
                        frame2.setVisible(false);
                        frame3.setVisible(false);
                        frame4.setVisible(false);
                        frame5.setVisible(false);
                        frame6.setVisible(false);
                        frame7.setVisible(false);
                    }
                    else{
                        fail.setVisible(true);
                        frameCode1.setVisible(false);
                        frameCode2.setVisible(false);
                        frame2.setVisible(false);
                        frame3.setVisible(false);
                        frame4.setVisible(false);
                        frame5.setVisible(false);
                        frame6.setVisible(false);
                        frame7.setVisible(false);
                    }

                    String getReady = ready.getText();
                    if(getReady.equals("yes") || getReady.equals("Yes")) {
                        next.setVisible(false);
                        done.setVisible(false);
                        who.setVisible(true);
                        times.setVisible(true);
                    }

                    String howMany = timey.getText();
                    if(howMany.equals("2") || howMany.equals("twice")) {
                        times.setVisible(false);
                        who.setVisible(false);
                        bear.setVisible(true);
                        ready2.setVisible(true);
                    }
                    else if (howMany.equals("once") || howMany.equals("three")) {
                        fail.setVisible(true);
                        times.setVisible(false);
                        frameCode1.setVisible(false);
                        frameCode2.setVisible(false);
                        frame2.setVisible(false);
                        frame3.setVisible(false);
                        frame4.setVisible(false);
                        frame5.setVisible(false);
                        frame6.setVisible(false);
                        frame7.setVisible(false);
                    }

                    String youReady = readyy.getText();
                    String input = numby.getText();
                    if (youReady.equals("puzzle") || youReady.equals("Puzzle")) {
                        extra.setVisible(true);
                        theNumb.setVisible(true);
                        fail.setVisible(false);
                        bear.setVisible(false);
                        ready2.setVisible(false);
                        if(input.equals("124232484")) {
                            thanks.setVisible(true);
                            bear.setVisible(false);
                            ready2.setVisible(false);
                            extra.setVisible(false);
                            theNumb.setVisible(false);
                        }
                        
                        else if (input.equals("")){
                            fail.setVisible(false);
                            
                        }
                        else{
                            fail.setVisible(true);
                        }
                    }

                }
            };

        circles.addActionListener( action );
        secret.addActionListener( action );
        ready.addActionListener( action );
        timey.addActionListener( action );
        readyy.addActionListener( action );
        numby.addActionListener( action );
        frame2.setSize(275, 100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

    } 
}
