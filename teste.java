// Classe Aluno
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para exibir informações do aluno
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe Professor
public class Professor {
    private String nome;
    private String disciplina;

    // Construtor
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Método para exibir informações do professor
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
    }
}

// Classe Disciplina
public class Disciplina {
    private String nome;
    private String codigo;

    // Construtor
    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para exibir informações da disciplina
    public void mostrarInfo() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Código: " + codigo);
    }
}

// Classe Turma
import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    // Construtor
    public Turma(String codigo, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    // Métodos getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Método para adicionar aluno na turma
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para exibir informações da turma
    public void mostrarInfo() {
        System.out.println("Código da Turma: " + codigo);
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos na Turma:");
        for (Aluno aluno : alunos) {
            aluno.mostrarInfo();
        }
    }
}

// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando um professor e uma disciplina
        Professor professor = new Professor("João Silva", "Matemática");
        Disciplina disciplina = new Disciplina("Matemática", "MAT101");

        // Criando alguns alunos
        Aluno aluno1 = new Aluno("Maria Souza", 17, "2023001");
        Aluno aluno2 = new Aluno("José Santos", 16, "2023002");

        // Criando a turma e adicionando os alunos
        Turma turma = new Turma("TURMA01", professor, disciplina);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        // Exibindo informações da turma
        turma.mostrarInfo();
    }
}
