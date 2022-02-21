class Elipse {
  int x, y;
  int l, h;
  float rotacao;
  Cor contorno;
  Cor fundo;
  Elipse(int x, int y, int l, int h, float rotacao, Cor contorno, Cor fundo) {
    this.x = x;
    this.y = y;
    this.l = l;
    this.h = h;
    this.rotacao = rotacao;
    this.contorno = contorno;
    this.fundo = fundo;
  }

  void print () {
    System.out.format("- Elipse - \nposicao: (x:%d y:%d) \nmoldura: (largura:%dpx altura:%dpx) \nrotacao: %f \ncontorno: RGB(%d, %d, %d) \nfundo: RGB(%d, %d, %d)", this.x, this.y, this.l, this.h, this.rotacao, this.contorno.r, this.contorno.g, this.contorno.b, this.fundo.r, this.fundo.g, this.fundo.b);
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