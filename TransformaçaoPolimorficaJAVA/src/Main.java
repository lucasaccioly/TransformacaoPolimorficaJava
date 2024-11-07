import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        Disciplina disciplina = new Disciplina();
        TransformaçãoPolimorfica t = new TransformaçãoPolimorfica();
        t.polimorfismo_interface((Remuneravel) professor);
        ((Remuneravel) professor).calcularSalario();


        System.out.println("Aluno: Qual o seu nome?");
        aluno.setNome(sc.next());
        System.out.println("Aluno: Qual a sua idade?");
        ((Aluno) aluno).setIdade(sc.nextDouble());
        System.out.println("Digite a primeira nota:");
        ((Aluno) aluno).setNota1(sc.nextDouble());
        System.out.println("Digite a segunda nota:");
        ((Aluno) aluno).setNota2(sc.nextDouble());
        System.out.println("Digite a terceira nota:");
        ((Aluno) aluno).setNota3(sc.nextDouble());

        ((Aluno) aluno).calcularMedia();
        ((Aluno) aluno).verificarAprovacao();
        ((Aluno) aluno).detalhesAluno();

        System.out.println("Professor: Qual o seu nome?");
        professor.setNome(sc.next());
        System.out.println("Professor: Qual a sua idade?");
        ((Professor) professor).setIdade(sc.nextDouble());

        System.out.println("Professor: Qual a sua especialidade?");
        ((Professor) professor).setEspecialidade(sc.next());

        System.out.println("Professor: Qual o seu salário?");
        ((Professor) professor).setSalario(sc.nextDouble());
        System.out.println("Quem é você?");
        professor.quemSouEu();
        System.out.print("Qual é a sua responsibilidade?");
        professor.responsabilidade();


        ((Professor) professor).calcularSalario();
        ((Professor) professor).aplicarBonus();


        System.out.println("Informações do Professor:");
        System.out.println(professor);

        System.out.println("Informações do Aluno:");
        System.out.println(aluno);


        System.out.print("Digite o nome da disciplina: ");
        disciplina.setNome(sc.next());

        disciplina.cadastrarAluno((Aluno) aluno);
        disciplina.ministrarDisciplina((Professor) professor);

        System.out.println("Informações da Disciplina:");
        System.out.println(disciplina);
    }
}