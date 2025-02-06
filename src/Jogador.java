import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jogador {
    private String nome;
    private String posicao;
    private String dataDeNascimento;
    private String nacionalidade;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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
                "nacionalidade = " + nacionalidade + "\n" +
                "altura = " + altura + "\n" +
                "peso = " + peso;
    }

    public void mostarIdade(){
        String padrao = "\\d{4}";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(getDataDeNascimento());
        if (matcher.find()) {
            String idade_str = matcher.group();
            int idade = Integer.parseInt(idade_str);
            System.out.println(2025 - idade);
        }
    }
}
