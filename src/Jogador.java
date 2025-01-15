import java.time.format.DateTimeFormatter;

public class Jogador {
    private String nome;
    private String posicao;
    private DateTimeFormatter dataDeNascimento = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nacionalidad;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public DateTimeFormatter getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = DateTimeFormatter.ofPattern(dataDeNascimento);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String imprimirAtributos() {
        return "Jogador = " + nome + "\n" +
                "posicao = " + posicao + "\n" +
                "dataDeNascimento = " + dataDeNascimento + "\n" +
                "nacionalidad = " + nacionalidad + "\n" +
                "altura = " + altura + "\n" +
                "peso = " + peso;
    }


}
