#include <stdio.h>

typedef struct {
  int x, y;
  char* fonte;
  int tamanho;
  int r, g, b;
  char* alinhamento;
  float rotacao;
  int espacamento;
} Text;

void print(Text * text) {
  printf("- Texto - \n\
  posicao: (x:%d y: %d) \n\
  fonte: %s\n\
  tamanho: %dpx\n\
  cor: RGB(%d, %d, %d)\n\
  alinhamento: %s \n\
  rotacao: %0.2fº \n\
  espacamento: %dpx\n", text->x, text->y, text->fonte, text->tamanho, text->r, text->g, text->b, text->alinhamento, text->rotacao, text->espacamento);
}