public class Salas {
    protected String quarto;
    protected int portas, janelas, moveis;

    public Salas(String quarto, int portas, int janelas, int moveis) {
        this.quarto = quarto;
        this.portas = portas;
        this.janelas = janelas;
        this.moveis = moveis;
    }

    public String getQuarto() {
        return quarto;
    }

    public int getPortas() {
        return portas;
    }

    public int getJanelas() {
        return janelas;
    }

    public int getMoveis() {
        return moveis;
    }
}
