public class Carro {
    private String marca;
    private String model;
    private int ano;
    private double velocidade;

    public Carro(String marca, String model, int ano, double velocidade) {
        this.marca = marca;
        this.model = model;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acerar(){
        System.out.println("Carro acelerado!");
    }
    public void frear(){
        System.out.println("Carro freiado!");
    }
    public void exibirInformacoes(){
        System.out.println("Ano do carro = " + ano);
    }
}
