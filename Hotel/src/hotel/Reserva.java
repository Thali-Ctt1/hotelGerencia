package hotel;

public class Reserva {
    private String nomeHospede;
    private int numeroQuarto;
    private String dataCheckin;
    private String dataCheckout;
    private boolean vago;

    public Reserva(String nomeHospede, int numeroQuarto, String dataCheckin, String dataCheckout) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.vago = true; 
    }

    public String getNomeHospede() { return nomeHospede; }
    public int getNumeroQuarto() { return numeroQuarto; }
    public boolean isAtiva() { return vago; }

    public void cancelar() { this.vago = false; }

    @Override
    public String toString() {
        return "Reserva de " + nomeHospede + " - Quarto: " + numeroQuarto +
               " - Check-in: " + dataCheckin + " - Check-out: " + dataCheckout + 
               " - " + (vago ? "Ativa" : "Encerrada");
    }
}

