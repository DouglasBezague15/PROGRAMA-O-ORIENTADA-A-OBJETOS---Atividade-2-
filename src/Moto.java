public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo + " - Ano: " + getAno() + 
               " - Cilindrada: " + cilindrada + "cc";
    }
}
