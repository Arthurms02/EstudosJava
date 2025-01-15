public class Estudos {
    public static void main(String[] args) {
        Pessoa nova = new Pessoa("Arthur", 23, 1.95);

        nova.setNome("Arthur Marques");

        System.out.println(nova.getAltura());

        Carro meuCarro = new Carro("Fiat", "Uno", 2002, 80.00);

        meuCarro.exibirInformacoes();
        meuCarro.frear();





        for (int i = 1; i < 4; i++) {
            System.out.println(-i);
        }
    }
}
