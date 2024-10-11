public class App {
    public static void main(String[] args) throws Exception {
        Galinha galinha = new Galinha();

        galinha.nome = "Mimosa";
        galinha.idade = 2;
        galinha.cor = "Carijo";

        galinha.mostrarDadosNaTela();
        galinha.salvarGalinha();
        
        System.out.println("Idade em anos: " + galinha.calculaIdadeGalinha("2022-06-10"));

        System.out.println("Idade em anos e dias: " + galinha.calculaIdadeCompleta("2022-10-09"));
    }
}