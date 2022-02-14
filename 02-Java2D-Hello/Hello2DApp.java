import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello LP2");
        this.setSize(700, 400);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

        g2d.setPaint(Color.black);
        g2d.fillRect(0, 0, w, h);

        g2d.setPaint(Color.white);

        // letra L
        g2d.fillRect(80, 80, 30, 200);
        g2d.fillRect(80, 280, 140, 30);

        // letra P
        g2d.fillOval(245, 80, 160, 160);
        g2d.setPaint(Color.black);
        g2d.fillOval(275, 110, 100, 100);

        g2d.setPaint(Color.white);
        g2d.fillRect(260, 80, 30, 230);
        g2d.fillRect(290, 80, 40, 160);
        g2d.setPaint(Color.black);
        g2d.fillRect(220, 80, 40, 180);
        g2d.fillRect(290, 110, 40, 100);

        // número 2
        g2d.setPaint(Color.white);
        g2d.fillRect(450, 80, 140, 30);
        g2d.fillRect(560, 80, 30, 100);
        g2d.fillRect(450, 180, 140, 30);
        g2d.fillRect(450, 180, 30, 100);
        g2d.fillRect(450, 280, 140, 30);
        
    }
}