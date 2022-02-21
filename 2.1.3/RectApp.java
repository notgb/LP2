public class RectApp {
  public static void main (String[] args) {
      Rect r1 = new Rect(1,1, 10,10);
      System.out.println("\n -- Antes do drag \\/ --");
      r1.print();
      System.out.format("Area = %d\n", r1.area());
      System.out.println("\n -- Após o drag (20px pra direita, 20px pra baixo) \\/ --");
      r1.drag(20, 20);
      r1.print();

   }
} 

class Rect {
   int x, y;
   int w, h;
   Rect (int x, int y, int w, int h) {
       this.x = x;
       this.y = y;
       this.w = w;
       this.h = h;
   }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
         this.w, this.h, this.x, this.y);
    }
    
    int area () {
        int rectArea = this.w * this.h;
        return rectArea;
    }

    void drag(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}