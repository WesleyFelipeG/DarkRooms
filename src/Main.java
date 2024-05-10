public class Main {

    public static void main(String[] args) {
        Salas sala1 = new Salas("Sala 1", 1, 2, 1);
        Salas sala2 = new Salas("Sala 2", 1, 1, 0);
        Salas sala3 = new Salas("Sala 3", 2, 2, 3);

        System.out.println("Escolha a sala para defender: " +
                "\n" +
                "\n" + sala1.getQuarto() +
                "\n-Portas: " + sala1.getPortas() +
                "\n-Janelas: " + sala1.getJanelas() +
                "\n-Moveis: " + sala1.getMoveis() +
                "\n" +
                "\n" + sala2.getQuarto() +
                "\n-Portas: " + sala2.getPortas() +
                "\n-Janelas: " + sala2.getJanelas() +
                "\n-Moveis: " + sala2.getMoveis() +
                "\n" +
                "\n" + sala3.getQuarto() +
                "\n-Portas: " + sala3.getPortas() +
                "\n-Janelas: " + sala3.getJanelas() +
                "\n-Moveis: " + sala3.getMoveis());

    }
}