public class Pontuacao {
   public int pontos;

    public Pontuacao() {
        this.pontos = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getPontos() {
        return pontos;
    }
}
