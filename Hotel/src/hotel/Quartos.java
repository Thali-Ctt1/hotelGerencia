package hotel;

public class Quartos {
	
    private int numero;
    private String tipo;
    private double precoDiario;
    private boolean disponivel;


	public Quartos(int numero, String tipo, double diaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = diaria;
        this.disponivel = true;
    }

    public int getNumero()
    { return numero; 
        }
    public String getTipo(){
        return tipo;
    }
    public double getPrecoDiario() { 
    	return precoDiario; 
    	}
    public boolean isDisponivel() { 
    	return disponivel;
    	}

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + " - " + tipo + " - R$ " + precoDiario + 
               " - " + (disponivel ? "Disponível" : "Ocupado");
    }
}
