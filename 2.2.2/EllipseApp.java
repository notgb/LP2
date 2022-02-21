import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;


public class EllipseApp {
  public static void main (String[] args) {
      PaintFrame frame = new PaintFrame();
      frame.setVisible(true);
    }
}

class Ellipse  {
  int x, y;
  int w, h;
  Cor contorno;
  Cor fundo;
  Ellipse (int x, int y, int w, int h, Cor contorno, Cor fundo) {
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      this.contorno = contorno;
      this.fundo = fundo;
  }

   public void paint (Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(new Color(this.fundo.r, this.fundo.g, this.fundo.b));
       g2d.fill(new Ellipse2D.Double(this.x, this.y, this.w, this.h));
       g2d.setColor(new Color(this.contorno.r, this.contorno.g, this.contorno.b));
       g2d.draw(new Ellipse2D.Double(this.x, this.y, this.w, this.h));
   }
}

class Cor{
    int r, g, b;
    Cor(int r, int g, int b) {
      this.r = r;
      this.g = g;
      this.b = b;
    }
  }

class PaintFrame extends JFrame {
    Ellipse e1, e2, e3;

    PaintFrame() {
        this.setTitle("Elipses");
        this.setSize(600, 500);
        this.e1 = new Ellipse(150,200, 100,100, new Cor(0,0,255), new Cor(255,0,0));
        this.e2 = new Ellipse(300,200, 80,120, new Cor(0,255,0), new Cor(0,0,255));
        this.e3 = new Ellipse(200,80, 200,80, new Cor(0,0,0), new Cor(255,255,255));
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }
}

