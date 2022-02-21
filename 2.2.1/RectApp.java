import java.awt.*;
import javax.swing.*;

public class RectApp {
  public static void main (String[] args) {
      PaintFrame frame = new PaintFrame();
      frame.setVisible(true);
    }
} 

class Rect {
   int x, y;
   int w, h;
   Cor contorno;
   Cor fundo;
   Rect (int x, int y, int w, int h, Cor contorno, Cor fundo) {
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
        g2d.fillRect(this.x, this.y, this.w, this.h);
        g2d.setColor(new Color(this.contorno.r, this.contorno.g, this.contorno.b));
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }

}

class Cor{
    int r, g, b, espessura;
    Cor(int r, int g, int b) {
      this.r = r;
      this.g = g;
      this.b = b;
    }
}

class PaintFrame extends JFrame {
    Rect r1, r2, r3;

    PaintFrame() {
        this.setTitle("Retangulos");
        this.setSize(600, 500);
        this.r1 = new Rect(150,200, 100,100, new Cor(0,0,255), new Cor(255,0,0));
        this.r2 = new Rect(300,200, 80,120, new Cor(0,255,0), new Cor(0,0,255));
        this.r3 = new Rect(200,80, 200,80, new Cor(0,0,0), new Cor(255,255,255));
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.r2.paint(g);
        this.r3.paint(g);
    }
}

