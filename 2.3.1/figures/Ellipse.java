package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse  {
    private int x, y;
    private int w, h;
    private Cor contorno;
    private Cor fundo;

    public Ellipse (int x, int y, int w, int h, Cor contorno, Cor fundo) {
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