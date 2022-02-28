// OBS: Já havia sido feita a divisão em pacotes

import java.awt.*;
import javax.swing.*;
import figures.*;


class FiguresApp {
  public static void main (String[] args) {
      PaintFrame frame = new PaintFrame();
      frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Line l1, l2;
    Ellipse e1;
    Rect r1;

    PaintFrame() {
        this.setTitle("Figuras");
        this.setSize(600, 500);
        this.l1 = new Line(100,300,400,200);
        this.l2 = new Line(100,200,400,300);
        this.e1 = new Ellipse(400, 200, 150, 80, new Cor(255,0,0), new Cor(0,0,0));
        this.r1 = new Rect(150, 300, 100, 100, new Cor(0,0,0), new Cor(0,0,255));
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.l1.paint(g);
        this.l2.paint(g);
        this.e1.paint(g);
        this.r1.paint(g);

    }
}

