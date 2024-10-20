package hotel;

import java.util.ArrayList;

public class HotelGeral {
    private ArrayList<Quartos> quartos = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void cadastrarQuarto(int numero, String tipo, double precoDiario) {
        quartos.add(new Quartos(numero, tipo, precoDiario));
        System.out.println(" QUARTO CADASTRADO ");
    }

    public void cadastrarReserva(String nomeHospede, int numeroQuarto, String checkin, String checkout) {
        for (Quartos quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                reservas.add(new Reserva(nomeHospede, numeroQuarto, checkin, checkout));
                quarto.setDisponivel(false);
                System.out.println("\n -----------------------------------------");
                System.out.println("\n ----- RESERVA REALIZADA COM SUCESSO -----");
                System.out.println("\n ----- BOA HOSPEDAGEM -----");
                System.out.println("\n -----------------------------------------");
                return;
            }
        }
        System.out.println("Quarto não disponível.");
    }

    public void realizarCheckOut(int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.getNumeroQuarto() == numeroQuarto && reserva.isAtiva()) {
                reserva.cancelar();
                atualizarDisponibilidade(numeroQuarto, true);
                System.out.println("\n -----------------------------------------");
                System.out.println("\n CHECK-OUT REALIZADO!");
                System.out.println("\n OBRIGADO E VOLTE SEMPRE!");
                System.out.println("\n -----------------------------------------");
                return;
            }
        }
        System.out.println("OPS! Esse quarto esta ocupado.");
    }

    private void atualizarDisponibilidade(int numeroQuarto, boolean disponivel) {
        for (Quartos quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                quarto.setDisponivel(disponivel);
                return;
            }
        }
    }

    public void listarQuartos() {
        System.out.println("\n Quartos Disponíveis:");
        for (Quartos quarto : quartos) {
            System.out.println(quarto);
        }
    }

    public void listarReservas() {
        System.out.println("\n Reservas realizadas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
