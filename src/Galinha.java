import java.time.LocalDate;
import java.time.Period;

public class Galinha {
    public String nome;
    public int idade;
    public String cor;

    public void salvarGalinha() {
        System.out.println("Galinha salva.");
    }

    public boolean excluirGalinha() {
        System.out.println("Galinha excluída.");
        return true;
    }

    public int calculaIdadeGalinha(String dataNascimento) {
        Period period = Period.between(LocalDate.parse(dataNascimento), LocalDate.now());
        return period.getYears();
    }

    public String calculaIdadeCompleta(String dataNascimento) {
        LocalDate nascimento = LocalDate.parse(dataNascimento);
        LocalDate agora = LocalDate.now();
        Period period = Period.between(nascimento, agora);

        int anos = period.getYears();
        int meses = period.getMonths();
        int dias = period.getDays();

        return anos + " anos, " + meses + " meses e " + dias + " dias";
    }

    public void mostrarDadosNaTela() {
        System.out.println("Nome da Galinha: " + nome);
        System.out.println("Idade da Galinha: " + idade);
        System.out.println("Cor da Galinha: " + cor);
    }
}